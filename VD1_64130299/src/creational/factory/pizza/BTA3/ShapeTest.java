package creational.factory.pizza.BTA3;

public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        //Tạo hình chữ nhật
        Shape hcn = shapeFactory.createShape(ShapeType.HINH_CHU_NHAT);
        System.out.println(hcn.draw());
    }
}
