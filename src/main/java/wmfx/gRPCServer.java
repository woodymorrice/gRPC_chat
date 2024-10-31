package wmfx;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class gRPCServer implements ServerCommunicationInterface {
    Server server;
    ManagedChannel channel;
    ServerInterfaceGrpc.ServerInterfaceBlockingStub stub;

    public gRPCServer() {}

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
            new Thread(() -> {
                try {
                    server.awaitTermination(); // This will block in the new thread
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

    public ClientRequestOuterClass.ClientRequest receiveRequest() {
        Empty empty = Empty.newBuilder().build();
        return stub.dequeueRequest(empty);
    }

    public int sendReply(ServerReplyOuterClass.ServerReply reply) {
        stub.queueReply(reply);
        return 0;
    }
}