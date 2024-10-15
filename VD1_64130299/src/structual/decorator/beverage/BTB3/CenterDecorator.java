package structual.decorator.beverage.BTB3;

public class CenterDecorator extends LayoutWidgetDecorator{
    public CenterDecorator(IWidget component) {
        super(component);
    }

    @Override
    public String build() {
        return "Center ( " + component.build() + " )";
    }
}
