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
            channel = ManagedChannelBuilder.forAddress("localhost", 8080)
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
//         try {
//             // System.out.println("RMIserver calling serverObject.dequeueRequest()");
//             return server.getServices().
//         }
//         catch (RemoteException e) {
//             System.err.println("Remote Error: " + e);
//             return null;
//         }
//        return null;
        Empty empty = Empty.newBuilder().build();
        return stub.dequeueRequest(empty);
    }

    public int sendReply(ServerReplyOuterClass.ServerReply reply) {
        // try {
        //     serverObject.queueReply(reply);
        // }
        // catch (RemoteException e) {
        //     System.err.println("Remote Error: " + e);
        //     return -1;
        // }
        System.out.println("calling stub.queueReply(reply);");
        stub.queueReply(reply);
        return 0;
    }

    public int notify(ServerReplyOuterClass.ServerReply reply) {
        // NOT USED ATM
        return 0;
    }
}