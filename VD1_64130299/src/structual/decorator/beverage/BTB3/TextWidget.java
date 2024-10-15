package structual.decorator.beverage.BTB3;

public class TextWidget implements IWidget{
    private  String content;

    public TextWidget(String content) {
        this.content = content;
    }

    @Override
    public String build() {
        return "Content: " + content;
    }
}
