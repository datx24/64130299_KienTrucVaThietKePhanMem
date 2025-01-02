package behavioral.observer.weather;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject_64130299 {
    private List<Observer_64130299> observers = new ArrayList<>();

    public void addObserver(Observer_64130299 observer64130299) {
        observers.add(observer64130299);
    }

    public void removeObserver(Observer_64130299 observer64130299) {
        observers.remove(observer64130299);
    }

    public void notifyObserver(String weatherUpdate) {
        for(Observer_64130299 observer64130299: observers) {
            observer64130299.update(weatherUpdate);
        }
    }

}
