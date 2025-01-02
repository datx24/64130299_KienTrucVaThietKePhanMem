package behavioral.mediator.BTK2;

public class Shop extends Participant{
    public Shop(OrderMediator mediator) {
        super(mediator);
    }

    public void processOrder() {
        System.out.println("Shop: Processing order...");
        send("Order confirmed and sent to delivery !");
    }

    @Override
    public void send(String message) {
        mediator.sendMessage(message,this);
    }

    @Override
    public void receive(String message) {
        System.out.println("Shop receive: " + message);
    }
}
