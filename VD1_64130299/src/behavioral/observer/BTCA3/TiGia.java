package behavioral.observer.BTCA3;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    private List<Listener> listeners = new ArrayList<>();
    private float rate;
    public void addListener(Listener listener) {
        listeners.add(listener);
    }
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }

    public void setRate(float newRate) {
        this.rate = newRate;
        System.out.println("Tỉ giá mới + " + rate + " USD-VND");
        notifyListener();
    }

    private void notifyListener() {
        for(Listener listener: listeners) {
            listener.update(rate);
        }
    }
}
