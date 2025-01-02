package behavioral.command.AppCalculator;

public class Client {
    public static void main(String[] args) {
        CasioCalculator casioCalculator = new CasioCalculator();

        casioCalculator.compute('+', 10);
        System.out.println(casioCalculator.getResult());
    }
}
