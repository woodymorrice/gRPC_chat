package wmfx;

/* Common methods to abstract away middleware
 * from main server implementation */
public interface ClientCommunicationInterface {
    int establishConnection(String clientId);
    int sendMessage(ClientRequestOuterClass.ClientRequest message);
    ServerReplyOuterClass.ServerReply getReply();
}
