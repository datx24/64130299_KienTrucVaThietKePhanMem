package structual.decorator.beverage.BTB3;

public class WidgetTest {
    public static void main(String[] args) {
        //Tạo 1 TextWidget
        IWidget textWidget = new TextWidget("Ngày mai là thứ 4 !");
        //Bọc TextWidget trong CenterDecorator
        IWidget centeredText = new CenterDecorator(textWidget);
        //Bọc tiếp vào ContainerDecorator với padding là 5px
        IWidget paddedCenteredText = new ContainerDecorator(centeredText,"5px");

        //Tạo 1 button
        IWidget buttonWidget = new ButtonWidget("Lưu thông tin");
        IWidget rowButton = new RowDecorator(buttonWidget);
        //In ra kết quả
        System.out.println(paddedCenteredText.build());
        System.out.println(rowButton.build());
    }
}
