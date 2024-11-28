package behavioral.state.BTCF1;

public class RemoteControl {
    private IRemoteState currentState;
    public RemoteControl() {
        currentState = new OffState();
    }
    public void setState(IRemoteState state) {
        this.currentState = state;
    }
    public void powerPress() {
        currentState.handle(this);
    }
}
