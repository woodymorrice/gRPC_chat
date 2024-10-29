package wmfx;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.util.Iterator;

public class gRPCClient implements ClientCommunicationInterface {
    ManagedChannel channel;
    ServerInterfaceGrpc.ServerInterfaceBlockingStub stub;
    String clientId;
    Iterator listener;

     final int RETRY_ATTEMPTS = 3;
     final int RETRY_DELAY_MS = 3000;

    public gRPCClient() {}

    public int establishConnection(String cid) {
         clientId = cid;
         for (int i = 0; i < RETRY_ATTEMPTS; i++) {
             try {
                 channel = ManagedChannelBuilder.forAddress("localhost", 8080)
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
        //     try {
        //         clientObject = new ClientObject();
        //         registry = LocateRegistry.getRegistry("server", 1099);
        //         try {
        //             serverInterface = (ServerInterface) registry.lookup("serverObject");
        //             serverInterface.registerClient(clientId, clientObject);
        //             // System.out.println("client registered.."); //debug
        //         }
        //         catch (NotBoundException e) {
        //             System.err.println("Error: Registry name not bound. " + e);
        //             return -1;
        //         }
        //     }
        //     catch (RemoteException e) {
        //     }
         }
        return 0;
    }

    public int sendMessage(ClientRequestOuterClass.ClientRequest message) {
         try {
             stub.queueRequest(message);
        //     // System.out.println("RMIclient calling serverInterface.queueRequest(message)"); // debug
//             serverInterface.queueRequest(message);
         }
         catch (Exception e) {
             System.err.println("Error: " + e);
             return -1;
         }
        return 0;
    }
    
    public ServerReplyOuterClass.ServerReply getReply() {
        return (ServerReplyOuterClass.ServerReply) listener.next();
        // try {
        //     return clientObject.dequeue();
        // }
        // catch (RemoteException e) {
        //     System.err.println("Remote Error: " + e);
        //     return null;
        // }
//        return null;
    }  
}