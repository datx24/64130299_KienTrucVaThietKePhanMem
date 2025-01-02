package behavioral.observer.atm;

public interface Subject {
    void dangKiTaiKhoan(Observer observer);
    void huyDangKiTaiKhoan(Observer observer);
    void rutTien(float soTienRut);
}
