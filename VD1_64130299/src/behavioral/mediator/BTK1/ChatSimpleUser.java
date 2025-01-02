package behavioral.mediator.BTK1;

public class ChatSimpleUser extends ChatUser{
    public ChatSimpleUser(IChatMediator mediator, String id, String name) {
        super(mediator, id, name);
    }

    @Override
    public void register() {
        mediator.register(this);
    }

    @Override
    public void unregister() {
        mediator.unregister(this);
    }

    @Override
    public void sendMessage(String message, String told) {
        System.out.println(name + " gửi tin nhắn tới " + name + ": " + message);
        mediator.sendMessage(message,this,told);
    }

    @Override
    public void sendBroadcast(String message) {
        System.out.println(name + " gửi tin nhắn tới tất cả mọi người" + ": " + message);
        mediator.sendBroadCast(message,this);
    }

    @Override
    public void receive(String message, ChatUser from) {
        System.out.println(name + " nhận tin nhắn từ " + from.getName() + ": " + message);
    }
}
