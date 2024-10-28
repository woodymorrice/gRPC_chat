package wmfx;// import java.rmi.NotBoundException;
// import java.rmi.RemoteException;
// import java.rmi.registry.LocateRegistry;
// import java.rmi.registry.Registry;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class gRPCClient implements ClientCommunicationInterface {
    // ClientObject clientObject;
    // Registry registry;
    // ServerInterface serverInterface;
    ManagedChannel channel;
    ServerInterfaceGrpc.ServerInterfaceBlockingStub stub;
    String clientId;

     final int RETRY_ATTEMPTS = 3;
     final int RETRY_DELAY_MS = 3000;

    public gRPCClient() {}

    public int establishConnection(String cid) {
         clientId = cid;
         for (int i = 0; i < RETRY_ATTEMPTS; i++) {
             try {
             channel = ManagedChannelBuilder.forAddress("server", 8080)
                     .build();

             stub = ServerInterfaceGrpc.newBlockingStub(channel);

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
        // try {
        //     // System.out.println("RMIclient calling serverInterface.queueRequest(message)"); // debug
        //     serverInterface.queueRequest(message);
        // }
        // catch (RemoteException e) {
        //     System.err.println("Remote Error: " + e);
        //     return -1;
        // }
        return 0;
    }
    
    public ServerReplyOuterClass.ServerReply getReply() {
        // try {
        //     return clientObject.dequeue();
        // }
        // catch (RemoteException e) {
        //     System.err.println("Remote Error: " + e);
        //     return null;
        // }
        return null;
    }  
}