package behavioral.state.bttlcf1;

public class RemoteControlApp {
    public static void main(String[] args) {
        TVContext context = new TVContext();

        context.pressPowerButton(); //On
        context.pressPowerButton();
        context.pressPowerButton();
    }
}
