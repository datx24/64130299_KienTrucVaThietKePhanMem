package structual.decorator.beverage.BTB3;

public class ContainerDecorator extends LayoutWidgetDecorator{
    private String padding;

    public ContainerDecorator(IWidget component, String padding) {
        super(component);
        this.padding = padding;
    }

    @Override
    public String build() {
        return "Container(padding = " + padding + ", child = " + component.build() + " )";
    }
}
