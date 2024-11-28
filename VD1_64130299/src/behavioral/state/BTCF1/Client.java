package behavioral.state.BTCF1;

public class Client {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        control.powerPress(); // output: on
        control.powerPress(); // output: off
        control.powerPress(); // output: on
    }
}
