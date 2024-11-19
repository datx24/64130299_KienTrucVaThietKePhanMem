package behavioral.observer.BTCA2;

public class Activity implements Listener{
    private int clickCount = 0;
    @Override
    public void onClick() {
        clickCount++;
        System.out.println("Bạn nhấn lần thứ " + clickCount + " !");
    }
}
