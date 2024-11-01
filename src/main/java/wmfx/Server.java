package wmfx;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

/* Performs initialization tasks and runs the server. */
public class Server {
    public static void main(String[] args) {
        try {
            ServerCommunicationInterface sci = new gRPCServer();
            sci.listenForConnections();
            ServerRunner sr = new ServerRunner(sci);
            sr.up(); // start the server
        } catch (Exception e) {
            System.err.println("Server exception: " + e);
        }
    }
}

/* Manages all aspects of the server--getting requests,
 * sending replies, updating rooms & usernames */
class ServerRunner {
    ServerCommunicationInterface sci;
    ExecutorService exec;
    Hashtable<String, ChatRoom> rooms;
    Hashtable<String, String> usernames;

    public ServerRunner(ServerCommunicationInterface sci) {
        this.sci = sci;
        // create a thread pool
        exec = Executors.newFixedThreadPool(32);
        rooms = new Hashtable<>();
        usernames = new Hashtable<>();
    }

    /* Starts the receiver thread. */
    public void up() {
        Runnable receiver = new Receiver();
        exec.execute(receiver);
    }

    /* Gets requests and spawns thread to handle requests. */
    class Receiver implements Runnable {
        public void run() {
            while (true) {
                ClientRequestOuterClass.ClientRequest req = sci.receiveRequest();
                if (req != null) { // create a reply thread
                    Runnable replier = new Replier(req);
                    exec.execute(replier);
                }
            }
        }
    }

    /* Parses requests, performs necessary computations,
     * and dispatches replies. */
    class Replier implements Runnable {
        ClientRequestOuterClass.ClientRequest request;

        public Replier(ClientRequestOuterClass.ClientRequest request) {
            this.request = request;
        }

        public void run() {
            ServerReplyOuterClass.ServerReply reply = parseRequest(request);
            if (reply != null) { // send reply
                sci.sendReply(reply);
            }
        }

        /* Parses client request and returns a ServerReply object
         * to send back to the client.*/
        private ServerReplyOuterClass.ServerReply parseRequest(ClientRequestOuterClass.ClientRequest request) {
            int result;
            // switch on request type and send appropriate reply
            switch (request.getType()) {
                case CREATE:
                    result = createRoom(request.getBody());
                    // SUCCESS
                    if (result == 0) {
                        return ServerReplyOuterClass.ServerReply.newBuilder()
                                .setClientId(request.getClientId())
                                .setType(ServerReplyOuterClass.ReplyType.CREATE_SUCCESS)
                                .setBody("")
                                .setRoom(request.getBody())
                                .build();
                    }
                    // FAILURE
                    return ServerReplyOuterClass.ServerReply.newBuilder()
                            .setClientId(request.getClientId())
                            .setType(ServerReplyOuterClass.ReplyType.CREATE_FAILURE)
                            .setBody("")
                            .setRoom(request.getBody())
                            .build();
                case JOIN:
                    String log = joinRoom(request.getBody());
                    // SUCCESS
                    if (log != null) {
                        return ServerReplyOuterClass.ServerReply.newBuilder()
                                .setClientId(request.getClientId())
                                .setType(ServerReplyOuterClass.ReplyType.JOIN_SUCCESS)
                                .setBody(log)
                                .setRoom(request.getBody())
                                .build();
                    }
                    // FAILURE
                    return ServerReplyOuterClass.ServerReply.newBuilder()
                            .setClientId(request.getClientId())
                            .setType(ServerReplyOuterClass.ReplyType.JOIN_FAILURE)
                            .setBody("")
                            .setRoom(request.getBody())
                            .build();
                case LEAVE:
                    result = leaveRoom(request.getRoom());
                    // SUCCESS
                    if (result == 0) {
                        return ServerReplyOuterClass.ServerReply.newBuilder()
                                .setClientId(request.getClientId())
                                .setType(ServerReplyOuterClass.ReplyType.LEAVE_SUCCESS)
                                .setBody("")
                                .setRoom(request.getRoom())
                                .build();
                    }
                    // FAILURE
                    return ServerReplyOuterClass.ServerReply.newBuilder()
                            .setClientId(request.getClientId())
                            .setType(ServerReplyOuterClass.ReplyType.LEAVE_FAILURE)
                            .setBody("")
                            .setRoom(request.getRoom())
                            .build();
                case LIST:
                    // SUCCESS
                    String list = listRooms();
                    return ServerReplyOuterClass.ServerReply.newBuilder()
                            .setClientId(request.getClientId())
                            .setType(ServerReplyOuterClass.ReplyType.LIST_SUCCESS)
                            .setBody(list)
                            .setRoom(request.getRoom())
                            .build();
                    // FAILURE - none.
                case MESSAGE:
                    ChatMsg message = addMessage(request);
                    // SUCCESS
                    if (message != null) {
                        return ServerReplyOuterClass.ServerReply.newBuilder()
                                .setClientId(request.getClientId())
                                .setType(ServerReplyOuterClass.ReplyType.NEW_MSG)
                                .setBody(message.toString())
                                .setRoom(request.getRoom())
                                .build();
                    }
                    // FAILURE
                    return ServerReplyOuterClass.ServerReply.newBuilder()
                            .setClientId("")
                            .setType(ServerReplyOuterClass.ReplyType.MSG_FAILURE)
                            .setBody(request.getBody())
                            .setRoom(request.getRoom())
                            .build();
                case NONE: // unused
                default: return null;
            }
        }
    }

    /* Creates a new chat room. */
    private int createRoom(String name) {
        ChatRoom room = rooms.get(name);
        if (room != null) { // room already exists
            return -1;
        }
        rooms.put(name, new ChatRoom());
        return 0;
    }

    /* Returns the room's log that the user
     * wants to join. */
    private String joinRoom(String name) {
        ChatRoom room = rooms.get(name);
        if (room == null) { // room doesn't exist
            return null;
        }
        return room.getLog();
    }

    /* Checks if the user is in a room to
     * send back an appropriate reply. */
    private int leaveRoom(String name) {
        if (name.isEmpty()) { // room doesn't exist
            return -1;
        }
        return 0;
    }

    /* Returns a list of available rooms
     * to join. */
    private String listRooms() {
        if (rooms.isEmpty()) { // no rooms
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

    /* Adds a message to a chat room's log. */
    private ChatMsg addMessage(ClientRequestOuterClass.ClientRequest request) {
        ChatRoom room = rooms.get(request.getRoom());
        if (room == null) { // just in case
            return null;
        }
        String name = usernames.get(request.getClientId());
        if (name == null) { // create a username on first message
            name = generateUsername(request.getClientId());
        }
        ChatMsg message = new ChatMsg(name, request.getBody());
        room.appendToLog(message);
        return message;
    }

    /* Generates a cute little username for a client because
     * UUIDs aren't very cute. */
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
        } // keep generating until the name is unique
        while (usernames.containsValue(name));
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
        return sb.toString();
    }
    public synchronized void appendToLog(ChatMsg msg) {
        log.add(msg);
    }
}

/** Stores information about a specific message. */
class ChatMsg {
    private final String user;
    private final String body;

    public ChatMsg(String user, String body) {
        this.user = user;
        this.body = body;
    }

    public String toString() { return user + ": " + body; }
}