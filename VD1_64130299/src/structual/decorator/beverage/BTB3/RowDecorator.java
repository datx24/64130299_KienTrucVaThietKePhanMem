package structual.decorator.beverage.BTB3;

public class RowDecorator extends LayoutWidgetDecorator{
    public RowDecorator(IWidget component) {
        super(component);
    }

    @Override
    public String build() {
        return "Row (" + component.build() + " )";
    }
}
