package behavioral.observer.atm;

public class AppATM {
    public static void main(String[] args) {
        ATM atm = new ATM();

        TaiKhoan taiKhoan1 = new TaiKhoan("Nguyễn Xuân Đạt", 1_000_000);
        TaiKhoan taiKhoan2 = new TaiKhoan("Trần Tiến Phúc", 10_000_000);

        atm.dangKiTaiKhoan(taiKhoan1);
        atm.dangKiTaiKhoan(taiKhoan2);
        System.out.println("-------------------------");
        atm.rutTien(500_000);
        atm.rutTien(5_000_000);
        System.out.println("-------------------------");
        atm.huyDangKiTaiKhoan(taiKhoan1);
        atm.rutTien(1_000_000);
    }
}
