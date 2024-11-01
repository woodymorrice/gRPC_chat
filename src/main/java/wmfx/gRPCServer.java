package wmfx;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

/* Separates specific middleware logic from Server.java by
 * implementing ServerCommunicationInterface. */
public class gRPCServer implements ServerCommunicationInterface {
    Server server;
    ManagedChannel channel;
    ServerInterfaceGrpc.ServerInterfaceBlockingStub stub;

    public gRPCServer() {}

    /* Performs necessary initialization and begins
     * listening for connections. */
    public int listenForConnections() {
        try {
            server = ServerBuilder.forPort(8080)
                    .addService(new ServerObject())
                    .build()
                    .start();
            System.out.println("Listening for connections on port 8080.");
            channel = ManagedChannelBuilder.forAddress("0.0.0.0", 8080)
                    .usePlaintext()
                    .build();
            stub = ServerInterfaceGrpc.newBlockingStub(channel);
            new Thread(() -> { // create new thread for blocking call
                try {
                    server.awaitTermination(); // This blocks
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        catch (Exception e) {
            System.err.println("Error: " + e);
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    /* Server.java calls this to get requests from the middleware
     * implementation. */
    public ClientRequestOuterClass.ClientRequest receiveRequest() {
        Empty empty = Empty.newBuilder().build();
        return stub.dequeueRequest(empty);
    }

    /* Server.java calls this to send replies to the
     * middleware implementation. */
    public int sendReply(ServerReplyOuterClass.ServerReply reply) {
        stub.queueReply(reply);
        return 0;
    }
}