package behavioral.state.BTCF2;

public class ATMApp {
    public static void main(String[] args) {
        ATMContext context = new ATMContext(15_000_000,3_000_000);
        context.withDram(10_000_000);
        context.withDram(3_000_000);
        context.withDram(10_000_000);
    }
}
