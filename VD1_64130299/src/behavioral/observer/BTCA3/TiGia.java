package behavioral.observer.BTCA3;

import java.util.ArrayList;
import java.util.List;

public class TiGia implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private float exchangeRate;

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.update(exchangeRate);
        }
    }
}
