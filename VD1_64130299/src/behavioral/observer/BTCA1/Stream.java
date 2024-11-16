package behavioral.observer.BTCA1;

import java.util.ArrayList;
import java.util.List;

public class Stream<T> {
    private List<Listener<T>> listeners = new ArrayList<>();
    private List<T> events = new ArrayList<>();

    public void addEvents(T t) {
        events.add(t);
        notifyListeners(t);
    }

    private void notifyListeners(T event) {
        for(Listener<T> listener: listeners) {
            listener.update(event);
        }
    }

    public void addListener(Listener<T> listener) {
        listeners.add(listener);
    }
}
