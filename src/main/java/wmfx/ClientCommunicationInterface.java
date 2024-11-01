package wmfx;

/* Common methods to abstract away middleware
 * from main server implementation */
public interface ClientCommunicationInterface {
    void establishConnection(String clientId);
    void sendMessage(ClientRequestOuterClass.ClientRequest message);
    ServerReplyOuterClass.ServerReply getReply();
}
