package behavioral.observer.BTCA2;

public class Main {
    public static void main(String[] args) {
        Button btn1 = new Button();
        Activity atv1 = new Activity();

        btn1.addListener(atv1);
        btn1.click();
        btn1.click();
        btn1.click();
    }
}
