package wmfx;

public interface ServerCommunicationInterface {
    int listenForConnections();
    ClientRequestOuterClass.ClientRequest receiveRequest();
    int sendReply(ServerReplyOuterClass.ServerReply reply);
//    int notify(ServerReplyOuterClass.ServerReply reply);
}
