package wmfx;

//import java.rmi.RemoteException;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable; // thread-safe!
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* NOTE -- queue and dequeue operations are all threadsafe because 
 * LinkedBlockingQueues are threadsafe by design. */
public class ServerObject extends ServerInterfaceGrpc.ServerInterfaceImplBase {
    private Hashtable <String, StreamObserver<ServerReplyOuterClass.ServerReply>> clients;
    private BlockingQueue<ClientRequestOuterClass.ClientRequest> clientRequests;
    private BlockingQueue<ServerReplyOuterClass.ServerReply> serverReplies;

    public ServerObject() {
        super();
        clients = new Hashtable<>();
        clientRequests = new LinkedBlockingQueue<>();
        serverReplies = new LinkedBlockingQueue<>();
    }

    public void registerClient(ServerInterfaceOuterClass.ClientRegistration clientId,
                               StreamObserver<ServerReplyOuterClass.ServerReply> responseObserver) {
        clients.put(clientId.getClientId(), responseObserver);


        responseObserver.onNext(
                ServerReplyOuterClass.ServerReply.newBuilder()
                        .setClientId("")
                        .setType(ServerReplyOuterClass.ReplyType.MSG_SUCCESS)
                        .setBody("")
                        .setRoom("")
                        .build()
        );
//        responseObserver.onCompleted();
    }

    public void queueRequest(ClientRequestOuterClass.ClientRequest message,
                             StreamObserver<Empty> responseObserver) {
        try {
            // System.out.println("ServerObject calling clientRequests.put(message)"); // debug
            clientRequests.put(message);

            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        }
        catch (InterruptedException e) {
            System.err.println("Interrupted Exception: " + e);
//            return -1;
        }
//        return 0;
    }

    public void dequeueRequest(Empty request, StreamObserver<ClientRequestOuterClass.ClientRequest> responseObserver) {
        try {
//            return clientRequests.take();
            ClientRequestOuterClass.ClientRequest message = clientRequests.take();

            responseObserver.onNext(message);
            responseObserver.onCompleted();
        }
        catch (InterruptedException e) {
            System.err.println("Interrupted Exception: " + e);
//            return null;
        }
//        return null;
    }

    public void queueReply(ServerReplyOuterClass.ServerReply message, StreamObserver<Empty> responseObserver) {
        try {
            serverReplies.put(message);
            System.out.println("calling self.dequeueReply()");
            dequeueReply();

            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        }
        catch (InterruptedException e) {
            System.err.println("Interrupted Exception: " + e);
//            return -1;
        }
//        return 0;
    }

    public int dequeueReply() {
        try {
            ServerReplyOuterClass.ServerReply message = serverReplies.take();
            if (Objects.equals(message.getClientId(), "")) {
                notify(message);
//                return 0;
            }
            else {
                StreamObserver<ServerReplyOuterClass.ServerReply> client =
                        clients.get(message.getClientId());
                try {
                    System.out.println("calling client.onNext(message);");
                    client.onNext(message);
                }
                catch (Exception e) {
                    clients.remove(message.getClientId());
                }
                return 0;
            }
        }
        catch (InterruptedException e) {
            System.err.println("Interrupted Exception: " + e);
            return -1;
        }
        return 0;
    }

//    public void dequeueReply(Empty request, StreamObserver<ServerReplyOuterClass.ServerReply> responseObserver) {
//        try {
//            ServerReplyOuterClass.ServerReply message = serverReplies.take();
//            if (message.getClientId() == "") {
//                notify(message);
////                return 0;
//            }
//            else {
////                ClientInterface client = clients.get(message.getClientId());
////                try {
////                    client.queue(message);
////                }
////                catch (Exception e) {
////                    clients.remove(message.getClientId());
////                }
////                return 0;
//            }
//        }
//        catch (InterruptedException e) {
//            System.err.println("Interrupted Exception: " + e);
////            return -1;
//        }
//        return 0;
//        responseObserver.onNext(null);
//        responseObserver.onCompleted();
//    }

    // EVENTUALLY CHANGE THIS SO IT DOESNT SEND MESSAGES TO EVERYONE
    // NOTE doesnt need to be synch because its only ever called inside
    // dequeueReply() which IS synch
    private int notify(ServerReplyOuterClass.ServerReply message) {
        clients.forEach((id, address) -> {
            try {
                // this doesnt work
                if (id != message.getClientId()) {
                    address.onNext(message);
                }
            }
            catch (Exception e) {
                clients.remove(id);
                System.err.println("Remote Exception: " + e);
            }
        });
        return 0;
    }
}