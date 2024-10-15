package structual.decorator.beverage.ViDu;

public class CondimentDecorator extends Beverage642{
    Beverage642 component;

    public CondimentDecorator(String description, Beverage642 component) {
        super(description);
        this.component = component;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", " + this.component.description;
    }

    @Override
    public double cost() {
        return component.cost() ;
    }
}
