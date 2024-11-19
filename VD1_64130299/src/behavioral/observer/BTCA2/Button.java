package behavioral.observer.BTCA2;

import java.util.ArrayList;
import java.util.List;

public class Button {
    private List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void click () {
        notifyListener();
    }

    private void notifyListener () {
        for (Listener listener: listeners) {
            listener.update();
        }
    }
}
