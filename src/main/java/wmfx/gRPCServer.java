package wmfx;// import java.rmi.AlreadyBoundException;
// import java.rmi.RemoteException;
// import java.rmi.registry.LocateRegistry;
// import java.rmi.registry.Registry;

public class gRPCServer implements ServerCommunicationInterface {
    // ServerObject serverObject;
    // Registry registry;

    public gRPCServer() {}

    public int listenForConnections() {
        // try {
        //     serverObject = new ServerObject();
        //     registry = LocateRegistry.createRegistry(1099);
        //     try {
        //         registry.bind("serverObject", serverObject);
        //     }
        //     catch (AlreadyBoundException e) {
        //         System.err.println("Name Already Bound: " + e);
        //         return -1;
        //     }
        // }
        // catch (RemoteException e) {
        //     System.err.println("Remote Error: " + e);
        //     return -1;
        // }
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