package structual.decorator.beverage.ViDu;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage642 b = new HouseBlend("Cà phê chồn");
        b = new Milk("Ông thọ",b);
        System.out.println(b.getDescription());
        System.out.println(b.cost());
    }
}
