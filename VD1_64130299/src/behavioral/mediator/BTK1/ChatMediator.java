package behavioral.mediator.BTK1;

import java.util.HashMap;

public class ChatMediator implements IChatMediator {
    HashMap<String, ChatUser> userMaps = new HashMap<>();
    @Override
    public void register(ChatUser user) {
        userMaps.put(user.getId(),user);
        System.out.println(user.getName() + " đã tham gia vào phòng chat");
    }

    @Override
    public void unregister(ChatUser user) {
        userMaps.remove(user.getId(),user);
        System.out.println();
    }

    @Override
    public void sendMessage(String message, ChatUser form, String told) {
        ChatUser receiver = userMaps.get(told);
        if(receiver != null) {
            receiver.receive(message,form);
        } else {
            System.out.println("Người dùng bạn nhắn không tồn tại");
        }
    }

    @Override
    public void sendBroadCast(String message, ChatUser from) {
        for(ChatUser user: userMaps.values()) {
            if(!user.equals(from)) {
                user.receive(message, from);
            }
        }
    }
}
