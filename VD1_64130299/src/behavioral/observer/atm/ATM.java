package behavioral.observer.atm;

import java.util.ArrayList;
import java.util.List;

public class ATM implements Subject{
    private List<Observer> observers = new ArrayList<>();


    @Override
    public void dangKiTaiKhoan(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void huyDangKiTaiKhoan(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void rutTien(float soTienRut) {
        for(Observer observer: observers) {
            observer.kiemTraSoDu(soTienRut);
        }
    }
}
