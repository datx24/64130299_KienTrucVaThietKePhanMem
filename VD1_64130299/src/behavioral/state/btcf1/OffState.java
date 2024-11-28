package behavioral.state.btcf1;

public class OffState implements IRemoteState{
    @Override
    public void handle(RemoteControl control) {
        System.out.println("Turning TV On...");
        control.setState(new OnState());
    }
}
