package creational.factory.pizza.ViDu;

public class PizzaHS extends Pizza{

    @Override
    public void prepare() {
        System.out.println("Chuẩn bị hải sản, bánh.");
    }

    @Override
    public void bake() {
        System.out.println("Nướng bánh 30 phút.");
    }

    @Override
    public void cut() {
        System.out.println("Cắt bánh làm 4 phần.");
    }

    @Override
    public void box() {
        System.out.println("Bỏ vào hộp pizza hải sản");
    }
}
