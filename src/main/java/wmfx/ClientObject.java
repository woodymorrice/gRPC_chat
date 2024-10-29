package wmfx;
import java.util.concurrent.LinkedBlockingQueue;
import io.grpc.stub.StreamObserver;
import com.google.protobuf.Empty;

public class ClientObject extends ClientInterfaceGrpc.ClientInterfaceImplBase {
     private LinkedBlockingQueue<ServerReplyOuterClass.ServerReply> serverReplies;

     public ClientObject() {
         super();
         serverReplies = new LinkedBlockingQueue<>();
     }

    public void queue(ServerReplyOuterClass.ServerReply message, StreamObserver<Empty> responseObserver) {
         try {
             serverReplies.put(message);
             responseObserver.onNext(Empty.newBuilder().build());
             responseObserver.onCompleted();
         }
         catch (InterruptedException e) {
             System.err.println("Interrupted Exception: " + e);
         }
    }

    public void dequeue(Empty request, StreamObserver<ServerReplyOuterClass.ServerReply> responseObserver) {
        try {
            ServerReplyOuterClass.ServerReply message = serverReplies.take();
            responseObserver.onNext(message);
            responseObserver.onCompleted();
        }
        catch (InterruptedException e) {
            System.err.println("Interrupted Exception: " + e);
        }
    }
}