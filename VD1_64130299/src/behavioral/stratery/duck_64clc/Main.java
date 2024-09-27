package behavioral.stratery.duck_64clc;

public class Main {
    public static void main(String[] args) {
        Duck duck = new VitQuay();
        duck.setFlyBehavior(new BayTrenThanHong());
        duck.setQuackBehavior(new VitQuayKeu());
        duck.display();
        System.out.println();
        Duck duck1 = new VitChien();
        duck1.setFlyBehavior(new VitChienBay());
        duck1.setQuackBehavior(new VitChienKeu());
        duck1.display();
    }
}
