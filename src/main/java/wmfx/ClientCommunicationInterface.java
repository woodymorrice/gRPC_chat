package wmfx;

public interface ClientCommunicationInterface {
    int establishConnection(String clientId);
    int sendMessage(ClientRequestOuterClass.ClientRequest message);
    ServerReplyOuterClass.ServerReply getReply();
}
