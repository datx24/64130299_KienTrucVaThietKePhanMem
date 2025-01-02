package behavioral.state.bttlcf1;

public class OnState implements State{

    @Override
    public void pressPowerButton(TVContext context) {
        System.out.println("Turning TV Off ...");
        context.setCurrentState(new OffState());
    }
}
