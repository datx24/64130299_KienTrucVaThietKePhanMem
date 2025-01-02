package behavioral.state.BTCF2;

public class ReadyState implements ATMState {
    @Override
    public void withDraw(ATMContext context, int amout) {
        if(amout <= context.getCurrentBalance()) {
            System.out.println("Rút " + amout + ".");
            context.setCurrentBalance(context.getCurrentBalance() - amout);

            if (context.getCurrentBalance() == 0) {
                context.setState(new NoCashState());
            }

            if (context.getCurrentBalance() < context.getMaxWithDrawLimit()) {
                context.setState(new LimitedCashState());
            }
        } else {
            System.out.println("Máy hết tiền để rút, vui lòng qua máy khác để rút !.");
        }
    }
}
