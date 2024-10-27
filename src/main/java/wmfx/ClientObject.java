package wmfx;// import java.rmi.RemoteException;
// import java.rmi.server.UnicastRemoteObject;
// import java.util.concurrent.BlockingQueue;
// import java.util.concurrent.LinkedBlockingQueue;
import io.grpc.stub.StreamObserver;
import com.google.protobuf.Empty;
// import io.grpc.*;
// import com.google.*;
// import ServerReplyOuterClass.ServerReply;

// public class ClientObject extends UnicastRemoteObject implements ClientInterface {
//     private BlockingQueue<ServerReply> serverReplies;

//     public ClientObject() throws RemoteException {
//         super();
//         serverReplies = new LinkedBlockingQueue<>();
//     }

//     public int queue(ServerReply message) throws RemoteException {
//         try {
//             serverReplies.put(message);
//         }
//         catch (InterruptedException e) {
//             System.err.println("Interrupted Exception: " + e);
//             return -1;
//         }
//         return 0;
//     }

//     public ServerReply dequeue() throws RemoteException {
//         try {
//             return serverReplies.take();
//         }
//         catch (InterruptedException e) {
//             System.err.println("Interrupted Exception: " + e);
//             return null;
//         }         
//     }
// }

// import ClientInterfaceGrpc.ClientInterfaceImplBase;

public class ClientObject extends ClientInterfaceGrpc.ClientInterfaceImplBase {
    // private BlockingQueue<ServerReply> serverReplies;

    // public ClientObject() throws RemoteException {
    //     super();
    //     serverReplies = new LinkedBlockingQueue<>();
    // }

    public void queue(ServerReplyOuterClass.ServerReply message, StreamObserver<Empty> responseObserver) {}

    public void dequeue(Empty request, StreamObserver<ServerReplyOuterClass.ServerReply> responseObserver) {
        // return null;
    }

}