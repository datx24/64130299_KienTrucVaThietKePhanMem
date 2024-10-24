package behavioral.observer.atm;

public class ATMTest {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoan t1 = new TaiKhoan(1000,"Đạt",atm);
        t1.duaTheVaoATM();
        atm.rutTien(300);
        System.out.println(".......");
        atm.rutTien(500);
        System.out.println(".......");
        t1.rutThe();
        atm.rutTien(500);
    }
}
