package structual.decorator.beverage.ViDu;

public class HouseBlend extends Beverage642{
    public HouseBlend(String description) {
        super(description);
    }

    @Override
    public double cost() {
        return 25000;
    }
}
