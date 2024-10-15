package structual.decorator.beverage.ViDu;

public class Milk extends CondimentDecorator{
    public Milk(String description, Beverage642 component) {
        super(description, component);
    }

    @Override
    public double cost() {
        return super.cost() + 5;
    }
}
