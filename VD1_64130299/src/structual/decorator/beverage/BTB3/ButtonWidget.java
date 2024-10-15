package structual.decorator.beverage.BTB3;

public class ButtonWidget implements IWidget{
    private String label;

    public ButtonWidget(String label) {
        this.label = label;
    }

    @Override
    public String build() {
        return "Button: " + label;
    }
}
