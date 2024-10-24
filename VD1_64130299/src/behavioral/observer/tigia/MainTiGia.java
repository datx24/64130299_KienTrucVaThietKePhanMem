package behavioral.observer.tigia;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia t = new TiGia();
        NhaDauTuA a = new NhaDauTuA(t);
        NhaDauTuB b = new NhaDauTuB(t);
        System.out.println("Lần 1: ");
        t.notify(5F);
        System.out.println("Lần 2: ");
        t.notify((float) -5);
    }
}
