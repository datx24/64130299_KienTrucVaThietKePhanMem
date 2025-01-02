package behavioral.mediator.BTK2;

public class DeliveryService extends Participant{

    public DeliveryService(OrderMediator mediator) {
        super(mediator);
    }

    public void deliverOrder() {
        System.out.println("Delivery Service: Delivering order...");
        send("Order is on the way");
    }

    public void confirmDelivery() {
        System.out.println("Delivery Service: Delivery completed");
        send("Order delivered successfully");
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Delivery receive: " +message);
    }
}
