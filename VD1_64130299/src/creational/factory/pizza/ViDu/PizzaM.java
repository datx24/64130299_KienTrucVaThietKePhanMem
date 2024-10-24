package creational.factory.pizza.ViDu;

public class PizzaM extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Chuẩn bị mắm,bột,nguyên liệu.");
    }

    @Override
    public void bake() {
        System.out.println("Bánh làm pizza mắm.");
    }

    @Override
    public void cut() {
        System.out.println("Cắt bánh làm 8 khúc.");
    }

    @Override
    public void box() {
        System.out.println("Bỏ bánh vào hộp pizza mắm.");
        pizza.append("Bỏ bánh vào hộp pizza mắm.");
    }
}
