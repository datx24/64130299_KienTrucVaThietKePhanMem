package behavioral.state.btcf1;

public class RemoteControl {
    private IRemoteState currentControl;
    public RemoteControl() {
        currentControl = new OffState();
    }
    public void setState(IRemoteState state) {
        this.currentControl = state;
    }
    public void powerPress() {
        currentControl.handle(this);
    }
}
