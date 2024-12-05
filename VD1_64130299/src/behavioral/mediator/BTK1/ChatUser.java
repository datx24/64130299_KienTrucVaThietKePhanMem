package behavioral.mediator.BTK1;

public abstract class ChatUser{
    protected IChatMediator mediator;
    protected String id;
    protected String name;

    public ChatUser(IChatMediator mediator, String id, String name) {
        this.mediator = mediator;
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void register();

    public abstract void unregister();

    public abstract void sendMessage(String message, String told);

    public abstract void sendBroadcast(String message);

    public abstract void receive(String message, ChatUser from);
}
