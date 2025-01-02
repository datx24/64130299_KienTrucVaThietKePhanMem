package behavioral.state.bttlcf1;

public class OffState implements State{

    @Override
    public void pressPowerButton(TVContext context) {
        System.out.println("Turning TV On ...");
        context.setCurrentState(new OnState());
    }
}
