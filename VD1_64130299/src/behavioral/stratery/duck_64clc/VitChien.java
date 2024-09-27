package behavioral.stratery.duck_64clc;

public class VitChien extends Duck
{
    @Override
    public void display() {
        System.out.println("Vịt chiên không dầu");
        this.performFly();
        this.performQuack();
        this.swim();
    }
}
