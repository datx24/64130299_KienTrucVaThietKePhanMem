package behavioral.command.btvidu;

public class Client {
    public static void main(String[] args) {
        CasioCalculator calculator = new CasioCalculator();

        calculator.compute('+',10);
        System.out.println(calculator.getResult());

        calculator.compute('*',2);
        System.out.println(calculator.getResult());

        calculator.undo();
        System.out.println(calculator.getResult());

        calculator.redo();
        System.out.println(calculator.getResult());

        calculator.clear();
        System.out.println(calculator.getResult());
    }
}
