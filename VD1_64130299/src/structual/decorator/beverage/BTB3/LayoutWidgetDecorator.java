package structual.decorator.beverage.BTB3;

public abstract class LayoutWidgetDecorator implements IWidget{
    protected  IWidget component;

    public LayoutWidgetDecorator(IWidget component) {
        this.component = component;
    }
}
