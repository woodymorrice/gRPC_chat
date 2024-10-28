package wmfx;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class gRPCServer implements ServerCommunicationInterface {
    Server server;

    public gRPCServer() {}

    public int listenForConnections() {
        try {
            server = ServerBuilder.forPort(8080)
                    .addService(new ServerObject())
                    .build()
                    .start();
            System.out.println("Listening for connections on port 8080.");

            server.awaitTermination();
        }
        catch (Exception e) {
            System.err.println("Error: " + e);
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

    public ClientRequestOuterClass.ClientRequest receiveRequest() {
        // try {
        //     // System.out.println("RMIserver calling serverObject.dequeueRequest()");
        //     return serverObject.dequeueRequest();
        // }
        // catch (RemoteException e) {
        //     System.err.println("Remote Error: " + e);
        //     return null;
        // }
        return null;
    }

    public int sendReply(ServerReplyOuterClass.ServerReply reply) {
        // try {
        //     serverObject.queueReply(reply);
        // }
        // catch (RemoteException e) {
        //     System.err.println("Remote Error: " + e);
        //     return -1;
        // }
        return 0;
    }

    public int notify(ServerReplyOuterClass.ServerReply reply) {
        // NOT USED ATM
        return 0;
    }
}