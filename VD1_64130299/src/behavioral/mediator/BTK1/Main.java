package behavioral.mediator.BTK1;

public class Main {
    public static void main(String[] args) {
        IChatMediator mediator = new ChatMediator();

        ChatUser user1 = new ChatSimpleUser(mediator,"1","Đạt");
        ChatUser user2 = new ChatSimpleUser(mediator,"2","Phúc");
        ChatUser user3 = new ChatSimpleUser(mediator,"3","Quang");
        ChatUser user4 = new ChatSimpleUser(mediator,"4","Tài");

        user1.register();
        user2.register();
        user3.register();
        user4.register();

        user1.sendMessage("Chào Phúc","2");
        user3.sendBroadcast("Xin chào tất cả mọi người");
        user4.unregister();
        user2.sendMessage("Chào Nam","5");
    }
}
