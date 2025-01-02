package behavioral.state.bttlcf1;

public class TVContext {
    private State currentState;

    public TVContext() {
        //Để mặc định là tắt
        currentState = new OffState();
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void pressPowerButton(){
        currentState.pressPowerButton(this);
    }
}
