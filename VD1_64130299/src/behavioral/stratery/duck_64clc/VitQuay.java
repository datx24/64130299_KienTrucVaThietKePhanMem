package behavioral.stratery.duck_64clc;

public class VitQuay extends Duck{
    @Override
    public void display() {
        System.out.println("Vịt quay Bắc Kinh");
        this.performFly();
        this.performQuack();
        this.swim();
    }
}
