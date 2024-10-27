package wmfx;

//import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable; // thread-safe!
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* NOTE -- queue and dequeue operations are all threadsafe because 
 * LinkedBlockingQueues are threadsafe by design. */
public class ServerObject extends ServerInterfaceGrpc.ServerInterfaceImplBase {
//    private Hashtable <String, ClientInterfaceGrpc.ClientInterfaceImplBase> clients;
//    private BlockingQueue<ClientRequestOuterClass.ClientRequest> clientRequests;
//    private BlockingQueue<ServerReplyOuterClass.ServerReply> serverReplies;

    public ServerObject() {
//        super();
//        clients = new Hashtable<>();
//        clientRequests = new LinkedBlockingQueue<>();
//        serverReplies = new LinkedBlockingQueue<>();
    }

    public synchronized void registerClient(String clientId,
                                            ClientInterfaceGrpc.ClientInterfaceImplBase client) {
//        clients.put(clientId, client);
    }

    public int queueRequest(ClientRequestOuterClass.ClientRequest message) {
//        try {
//            // System.out.println("ServerObject calling clientRequests.put(message)"); // debug
//            clientRequests.put(message);
//        }
//        catch (InterruptedException e) {
//            System.err.println("Interrupted Exception: " + e);
//            return -1;
//        }
        return 0;
    }

    public ClientRequestOuterClass.ClientRequest dequeueRequest() {
//        try {
//            return clientRequests.take();
//        }
//        catch (InterruptedException e) {
//            System.err.println("Interrupted Exception: " + e);
//            return null;
//        }
        return null;
    }

    public int queueReply(ServerReplyOuterClass.ServerReply message) {
//        try {
//            serverReplies.put(message);
//            dequeueReply();
//        }
//        catch (InterruptedException e) {
//            System.err.println("Interrupted Exception: " + e);
//            return -1;
//        }
        return 0;
    }

    public int dequeueReply() {
//        try {
//            ServerReply message = serverReplies.take();
//            if (message.getClientId() == "") {
//                notify(message);
//                return 0;
//            }
//            else {
//                ClientInterface client = clients.get(message.getClientId());
//                try {
//                    client.queue(message);
//                }
//                catch (Exception e) {
//                    clients.remove(message.getClientId());
//                }
//                return 0;
//            }
//        }
//        catch (InterruptedException e) {
//            System.err.println("Interrupted Exception: " + e);
//            return -1;
//        }
        return 0;
    }

    // EVENTUALLY CHANGE THIS SO IT DOESNT SEND MESSAGES TO EVERYONE
    // NOTE doesnt need to be synch because its only ever called inside
    // dequeueReply() which IS synch
    private int notify(ServerReplyOuterClass.ServerReply message) {
//        clients.forEach((id, address) -> {
//            try {
//                // this doesnt work
//                if (id != message.getClientId()) {
//                    address.queue(message);
//                }
//            }
//            catch (Exception e) {
//                clients.remove(id);
//                System.err.println("Remote Exception: " + e);
//            }
//        });
        return 0;
    }
}