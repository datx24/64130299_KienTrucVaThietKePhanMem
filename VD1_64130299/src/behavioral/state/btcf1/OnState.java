package behavioral.state.btcf1;

public class OnState implements IRemoteState{
    @Override
    public void handle(RemoteControl control) {
        System.out.println("Turning TV Off...");
        control.setState(new OffState());
    }
}
