package wmfx;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.Hashtable; // thread-safe!
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* Implements gRPC methods from ServerInterface.
 * NOTE -- queue and dequeue operations are all threadsafe because
 * LinkedBlockingQueues are threadsafe by design. Hash tables are too,
 * but I wrapped all calls to that in synchronized because I got a
 * warning about it. */
public class ServerObject extends ServerInterfaceGrpc.ServerInterfaceImplBase {
    private final Hashtable <String, StreamObserver<ServerReplyOuterClass.ServerReply>> clients;
    private final BlockingQueue<ClientRequestOuterClass.ClientRequest> clientRequests;
    private final BlockingQueue<ServerReplyOuterClass.ServerReply> serverReplies;

    public ServerObject() {
        super();
        clients = new Hashtable<>();
        clientRequests = new LinkedBlockingQueue<>();
        serverReplies = new LinkedBlockingQueue<>();
    }

    /* Clients call this to register themselves with the server. */
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
    }

    /* Clients call this to queue up requests for the server. */
    public void queueRequest(ClientRequestOuterClass.ClientRequest message,
                             StreamObserver<Empty> responseObserver) {
        try {
            clientRequests.put(message);
            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        }
        catch (InterruptedException e) {
            System.err.println("Interrupted Exception: " + e);
        }
    }

    /* Server calls this to get client requests. */
    public void dequeueRequest(Empty request, StreamObserver<ClientRequestOuterClass.ClientRequest> responseObserver) {
        try {
            ClientRequestOuterClass.ClientRequest message = clientRequests.take();
            responseObserver.onNext(message);
            responseObserver.onCompleted();
        }
        catch (InterruptedException e) {
            System.err.println("Interrupted Exception: " + e);
        }
    }

    /* Server calls this to queue up replies for clients. */
    public void queueReply(ServerReplyOuterClass.ServerReply message, StreamObserver<Empty> responseObserver) {
        try {
            serverReplies.put(message);
            dequeueReply();
            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();
        }
        catch (Exception e) {
            System.err.println("Interrupted Exception: " + e);
        }
    }

    /* This is called by queueReply in the current implementation.
     * Sends out replies to clients. */
    public synchronized void dequeueReply() {
        try {
            ServerReplyOuterClass.ServerReply message = serverReplies.take();
            // if new chat message, call notify()
            if (Objects.equals(message.getType(), ServerReplyOuterClass.ReplyType.NEW_MSG)) {
                notify(message);
            }
            else { // send reply to concerned client
                StreamObserver<ServerReplyOuterClass.ServerReply> client =
                        clients.get(message.getClientId());
                try {
                    client.onNext(message);
                }
                catch (Exception e) {
                    clients.remove(message.getClientId());
                }
            }
        }
        catch (InterruptedException e) {
            System.err.println("Interrupted Exception: " + e);
        }
    }

    /* Is called by dequeueReply, sends new chat messages to all
     * Clients in the room. */
    private synchronized void notify(ServerReplyOuterClass.ServerReply message) {
        clients.forEach((id, address) -> {
            try {
                if (!Objects.equals(id, message.getClientId())) {
                    address.onNext(message);
                }
            }
            catch (Exception e) {
                clients.remove(id);
                System.err.println("Remote Exception: " + e);
            }
        });
    }
}