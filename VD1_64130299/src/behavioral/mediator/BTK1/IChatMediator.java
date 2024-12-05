package behavioral.mediator.BTK1;

public interface IChatMediator {
    void register(ChatUser user);
    void unregister(ChatUser user);
    void sendMessage(String message, ChatUser form, String told);
    void sendBroadCast(String message, ChatUser from);
}
