package behavioral.state.BTCF2;

public class ATMContext {
    private ATMState currentState;
    private int currentBalance, maxWithDrawLimit;

    public ATMContext(int currentBalance, int maxWithDrawLimit) {
        this.currentBalance = currentBalance;
        this.maxWithDrawLimit = maxWithDrawLimit;
        if(currentBalance == 0) {
            currentState = new NoCashState();
        } else if (currentBalance < maxWithDrawLimit){
            currentState = new LimitedCashState();
        } else {
            currentState = new ReadyState();
        }
    }

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public void withDram(int amout) {
        currentState.withDraw(this,amout);
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public int getMaxWithDrawLimit() {
        return maxWithDrawLimit;
    }

    public void setMaxWithDrawLimit(int maxWithDrawLimit) {
        this.maxWithDrawLimit = maxWithDrawLimit;
    }
}
