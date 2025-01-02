package behavioral.mediator.BTK2;

public class Customer extends Participant{

    public Customer(OrderMediator mediator) {
        super(mediator);
    }

    public void placeOrder(String item, String deliveryService) {
        System.out.println("Customer: Placing order for " + item + " with " + deliveryService);
        send("Order " + item + " using " + deliveryService);
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Customer receive: " + message);
    }
}
