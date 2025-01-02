package behavioral.mediator.BTK2;

public abstract class Participant {
    protected OrderMediator mediator;

    public Participant(OrderMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
