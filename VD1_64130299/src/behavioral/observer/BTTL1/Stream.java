package behavioral.observer.BTTL1;

import java.util.ArrayList;
import java.util.List;

public class Stream<T> {
    private List<T> events = new ArrayList<>();
    private List<Listener<T>> listeners = new ArrayList<>();

    public void addEvent(T t) {
        events.add(t);
        notifyListener(t);
    }

    public void addListener(Listener<T> l) {
        listeners.add(l);
    }

    public void notifyListener(T event) {
        for(Listener<T> listener: listeners) {
            listener.update(event);
        }
    }
}
