package behavioral.state.BTCF2;

public class NoCashState implements ATMState {
    @Override
    public void withDraw(ATMContext context, int amout) {
        System.out.println("Máy hết tiền để rút, vui lòng qua máy khác để rút !.");
    }
}
