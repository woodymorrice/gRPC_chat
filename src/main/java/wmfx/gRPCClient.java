package wmfx;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.Iterator;

/* Separates specific middleware logic from Client.java by
 * implementing ClientCommunicationInterface. */
public class gRPCClient implements ClientCommunicationInterface {
    ManagedChannel channel;
    ServerInterfaceGrpc.ServerInterfaceBlockingStub stub;
    String clientId;
    Iterator listener;

    final int RETRY_ATTEMPTS = 3;
    final int RETRY_DELAY_MS = 3000;

    public gRPCClient() {}

    /* Performs necessary initialization and establishes
     * connection to the server. */
    public int establishConnection(String cid) {
         clientId = cid;
         for (int i = 0; i < RETRY_ATTEMPTS; i++) {
             try {
                 channel = ManagedChannelBuilder.forAddress(
                         "server", 8080)
                         .usePlaintext()
                         .build();
                 stub = ServerInterfaceGrpc.newBlockingStub(channel);
                 listener = stub.registerClient(
                         ServerInterfaceOuterClass.ClientRegistration.newBuilder()
                                 .setClientId(cid)
                                 .build()
                 );
                 System.out.println("Client connected.");
                 break;
             }
             catch (Exception e) {
                 System.err.println("Error: " + e);
                 System.out.println("Couldn't connect. Retrying..");
                 try {
                     Thread.sleep(RETRY_DELAY_MS);
                 }
                 catch (InterruptedException ie) {
                     System.err.println("Sleep failed: " + e);
                     return -1;
                 }
             }
         }
        return 0;
    }

    /* Passes messages from Client.java to middleware implementation. */
    public int sendMessage(ClientRequestOuterClass.ClientRequest message) {
         try {
             stub.queueRequest(message);
         }
         catch (Exception e) {
             System.err.println("Error: " + e);
             return -1;
         }
        return 0;
    }

    /* Gets messages from middleware implementation and passes
     * then to Client.java. */
    public ServerReplyOuterClass.ServerReply getReply() {
        return (ServerReplyOuterClass.ServerReply) listener.next();
    }  
}