package wmfx;

import java.util.Scanner;
import java.util.UUID;


public class Client {
    public static void main(String[] args) {
        ClientProperties cp = new ClientProperties();
        ClientCommunicationInterface cci = new gRPCClient();
        cci.establishConnection(cp.getClientId());
        SendThread sendThread = new SendThread(cci, cp);
        ReceiveThread receiveThread = new ReceiveThread(cci, cp);
        sendThread.start();
        receiveThread.start();
    }
}

class SendThread extends Thread {
    private ClientCommunicationInterface cci;
    private ClientProperties cp;

    public SendThread(ClientCommunicationInterface cci, ClientProperties cp) {
        this.cci = cci;
        this.cp = cp;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            ClientRequestOuterClass.ClientRequest request = parseRequest(input);
            if (request == null) {
                continue;
            }
            // System.out.println("client calling cci.sendMessage(request)"); // debug
            cci.sendMessage(request);
        }
        scanner.close();
    }

    private String getCommand(String input) {
        int firstSpace = input.indexOf(" ");
        return ((firstSpace == -1) ? input : input.substring(0, firstSpace));
    }

    private String getArgument(String input) {
        int firstSpace = input.indexOf(" ");
        return ((firstSpace == -1) ? "" : input.substring(firstSpace + 1));
    }

    private ClientRequestOuterClass.ClientRequest parseRequest(String input) {
        String cmd = getCommand(input);
        switch (cmd) {
//            case "": return null;
//            case "create":
//                if (getArgument(input).equals("")) {
//                    return null;
//                }
//                return new ClientRequest(
//                    cp.getClientId(),
//                    RequestType.CREATE,
//                    getArgument(input),
//                    cp.getRoomName()
//                );
//            case "list":
//                return new ClientRequest(
//                    cp.getClientId(),
//                    RequestType.LIST,
//                    "",
//                    cp.getRoomName()
//                );
//            case "join":
//                return new ClientRequest(
//                    cp.getClientId(),
//                    RequestType.JOIN,
//                    getArgument(input),
//                    cp.getRoomName()
//                );
//            case "leave":
//                return new ClientRequest(
//                    cp.getClientId(),
//                    RequestType.LEAVE,
//                    "",
//                    cp.getRoomName()
//                );
            default: 
//                if (cp.inRoom()) {
//                    return new ClientRequest(
//                        cp.getClientId(),
//                        RequestType.MESSAGE,
//                        input,
//                        cp.getRoomName()
//                    );
//                }
                return null;
        }
    }
}

class ReceiveThread extends Thread {
    ClientCommunicationInterface cci;
    ClientProperties cp;

    public ReceiveThread(ClientCommunicationInterface cci, ClientProperties cp) {
        this.cci = cci;
        this.cp = cp;
    }

    @Override
    public void run() {
        while (true) {
            ServerReplyOuterClass.ServerReply reply = cci.getReply();
            if (reply != null) {
                System.out.println(reply.toString());
                parseReply(reply);
            }
        }
    }

    private int parseReply(ServerReplyOuterClass.ServerReply reply) {
        switch (reply.getType()) {
//            case CREATE_SUCCESS:
//                System.out.println(
//                    "Created room: \"" + reply.getRoom() + "\"."
//                );
//                break;
//            case CREATE_FAILURE:
//                System.out.println(
//                    "Can't create room. " +
//                    "Room \"" + reply.getRoom() + "\" already exists."
//                );
//                break;
//            case JOIN_SUCCESS:
//                cp.setInRoom(true);
//                cp.setRoomName(reply.getRoom());
//                String log = "\n" + reply.getBody();
//                if (reply.getBody().equals("")) {
//                    log = "";
//                }
//                System.out.println(
//                    "Joined room: \"" + reply.getRoom() + "\"." + log
//                );
//                break;
//            case JOIN_FAILURE:
//                System.out.println(
//                    "Can't join room. " +
//                    "Room \"" + reply.getRoom() + "\" doesn't exist."
//                );
//                break;
//            case LIST_SUCCESS:
//                System.out.println(
//                    "Available rooms:\n" +
//                    reply.getBody()
//                );
//                break;
//            case LIST_FAILURE:
//                // never reached...
//                break;
//            case LEAVE_SUCCESS:
//                cp.setInRoom(false);
//                cp.setRoomName("");
//                System.out.println(
//                    "Left room: " + reply.getRoom() + "\"."
//                );
//                break;
//            case LEAVE_FAILURE:
//                System.out.println(
//                    "Can't leave room. " +
//                    "Not currently in a room."
//                );
//                break;
//            case MSG_SUCCESS: // silent/unused
//                break;
//            case MSG_FAILURE: // silent
//                break;
//            case NEW_MSG:
//                // if msg for a different room, disregard
//                if (reply.getRoom().equals(cp.getRoomName())
//                && !(cp.getRoomName().equals(""))) {
//                    System.out.println(reply.getBody());
//                }
//                break;
            default: break;
        }
        return 0;
    }
}

class ClientProperties {
    private String clientId;
    private String roomName;
    private boolean inRoom;

    public ClientProperties() {
        clientId = generateClientId();
        roomName = "";
        inRoom = false;
    }
    
    private String generateClientId() {
        return UUID.randomUUID().toString();
    }

    public String getClientId() { return clientId; }
    public synchronized String getRoomName() { return roomName; }
    public synchronized void setRoomName(String s) { roomName = s; }
    public synchronized boolean inRoom() { return inRoom; }
    public synchronized void setInRoom(boolean b) { inRoom = b; }
}