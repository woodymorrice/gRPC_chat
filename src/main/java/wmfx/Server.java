package wmfx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class Server {
    public static void main(String[] args) {
        try {
            ServerCommunicationInterface sci = new gRPCServer();
            sci.listenForConnections();
            ServerRunner sr = new ServerRunner(sci);
            sr.up();
        } catch (Exception e) {
            System.err.println("Server exception: " + e);
            // e.printStackTrace();
        }
    }
}

class ServerRunner {
    ServerCommunicationInterface sci;
    ExecutorService exec;
    Hashtable<String, ChatRoom> rooms;
    Hashtable<String, String> usernames;

    public ServerRunner(ServerCommunicationInterface sci) {
        this.sci = sci;
        exec = Executors.newFixedThreadPool(32);
        rooms = new Hashtable<>();
        usernames = new Hashtable<>();
    }

    public int up() {
        Runnable receiver = new Receiver();
        exec.execute(receiver);
        return 0;
    }

    class Receiver implements Runnable {
        public void run() {
            while (true) {
                // System.out.println("server calling sci.receiveRequest()");
                ClientRequestOuterClass.ClientRequest req = sci.receiveRequest();
                if (req != null) {
                    Runnable replier = new Replier(req);
                    exec.execute(replier);

                }
            }
        }
    }

    class Replier implements Runnable {
        ClientRequestOuterClass.ClientRequest request;

        public Replier(ClientRequestOuterClass.ClientRequest request) {
            this.request = request;
        }

        public void run() {
            System.out.println(request); //debug
            // ServerReply reply = new ServerReply(
            //     "",
            //     ReplyType.NEW_MSG, 
            //     "New message received!", 
            //     "");
            ServerReplyOuterClass.ServerReply reply = parseRequest(request);
            if (reply != null) {
                sci.sendReply(reply);
            }
        }

        private ServerReplyOuterClass.ServerReply parseRequest(ClientRequestOuterClass.ClientRequest request) {
            int result;
            switch (request.getType()) {
//                case CREATE:
//                    result = createRoom(request.getBody());
//                    // SUCCESS
//                    if (result == 0) {
//                        return new ServerReply(
//                            request.getClientId(),
//                            ReplyType.CREATE_SUCCESS,
//                            "",
//                            request.getBody()
//                        );
//                    }
//                    // FAILURE
//                    return new ServerReply(
//                            request.getClientId(),
//                            ReplyType.CREATE_FAILURE,
//                            "",
//                            request.getBody()
//                    );
//                case JOIN:
//                    String log = joinRoom(request.getBody());
//                    // SUCCESS
//                    if (log != null) {
//                        return new ServerReply(
//                            request.getClientId(),
//                            ReplyType.JOIN_SUCCESS,
//                            log,
//                            request.getBody()
//                        );
//                    }
//                    // FAILURE
//                    return new ServerReply(
//                            request.getClientId(),
//                            ReplyType.JOIN_FAILURE,
//                            "",
//                            request.getBody()
//                        );
//                case LEAVE:
//                    result = leaveRoom(request.getRoom());
//                    // SUCCESS
//                    if (result == 0) {
//                        return new ServerReply(
//                            request.getClientId(),
//                            ReplyType.LEAVE_SUCCESS,
//                            "",
//                            request.getRoom()
//                        );
//                    }
//                    // FAILURE
//                    return new ServerReply(
//                            request.getClientId(),
//                            ReplyType.LEAVE_FAILURE,
//                            "",
//                            request.getRoom()
//                    );
//                case LIST:
//                    // SUCCESS
//                    String list = listRooms();
//                    return new ServerReply(
//                            request.getClientId(),
//                            ReplyType.LIST_SUCCESS,
//                            list,
//                            request.getRoom()
//                    );
//                    // FAILURE - none.
//                case MESSAGE:
//                    ChatMsg message = addMessage(request);
//                    // SUCCESS
//                    if (message != null) {
//                        return new ServerReply(
//                                "",
//                                ReplyType.NEW_MSG,
//                                message.toString(),
//                                request.getRoom()
//                        );
//                    }
//                    // FAILURE
//                    return new ServerReply(
//                            "",
//                            ReplyType.MSG_FAILURE,
//                            request.getBody(),
//                            request.getRoom()
//                    );
//                case NONE: // unused
                default: return null;
            }
        }
    }

    private int createRoom(String name) {
        ChatRoom room = rooms.get(name);
        if (room != null) {
            return -1;
        }
        rooms.put(name, new ChatRoom());
        return 0;
    }

    private String joinRoom(String name) {
        ChatRoom room = rooms.get(name);
        if (room == null) {
            return null;
        }
        return room.getLog();
    }

    private int leaveRoom(String name) {
        if (name.equals("")) {
            return -1;
        }
        return 0;
    }

    private String listRooms() {
        if (rooms.size() == 0) {
            return "none";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<String> keys = new ArrayList<>(rooms.keySet());
        for (int i = 0; i < keys.size(); i++) {
            sb.append(keys.get(i));
            if (i != keys.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private ChatMsg addMessage(ClientRequestOuterClass.ClientRequest request) {
        ChatRoom room = rooms.get(request.getRoom());
        if (room == null) {
            return null;
        }
        String name = usernames.get(request.getClientId());
        if (name == null) {
            name = generateUsername(request.getClientId());
        }
        ChatMsg message = new ChatMsg(name, request.getBody());
        room.appendToLog(message);
        return message;
    }

    private String generateUsername(String clientId) {
        String[] adjectives = {
            "Brave", "Calm", "Cute", "Dizzy", "Fair", "Fast", "Fuzzy", "Gentle", "Glad", "Jolly",
            "Kind", "Lazy", "Loud", "Neat", "Nice", "Quick", "Quiet", "Silly", "Small", "Sweet",
            "Tall", "Tiny", "Warm", "Wise", "Zesty"
        };
        String[] animals = {
            "Ant", "Bat", "Bee", "Cat", "Cow", "Dog", "Fox", "Frog", "Hawk", "Lion",
            "Mole", "Owl", "Pig", "Rat", "Ram", "Seal", "Slug", "Swan", "Toad", "Wolf",
            "Yak", "Crab", "Deer", "Fish", "Goat"
        };
        Random random = new Random();
        String name;
        do {
            name = adjectives[random.nextInt(adjectives.length)] +
                          animals[random.nextInt(animals.length)];
        }
        while (usernames.containsKey(name));
        usernames.put(clientId, name);
        return name;
    }
}

/** Contains all information pertaining to individual rooms. */
class ChatRoom {
    private final ArrayList<ChatMsg> log;

    public ChatRoom() {
        log = new ArrayList<>();
    }

    public synchronized String getLog() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < log.size(); i++) {
            sb.append(log.get(i));
            if (i != log.size() - 1) {
                sb.append("\n");
            }
        }
        // for (ChatMsg msg: log) {
        //     sb.append(msg.toString()).append("\n");
        // }
        return sb.toString();
    }

    public synchronized void appendToLog(ChatMsg msg) {
        log.add(msg);
    }
}

/** Stores information about a specific message. Currently
 * only the user who posted it and the message itself. */
class ChatMsg {
    private final String user;
    private final String body;

    public ChatMsg(String user, String body) {
        this.user = user;
        this.body = body;
    }

    public String toString() { return user + ": " + body; }
}