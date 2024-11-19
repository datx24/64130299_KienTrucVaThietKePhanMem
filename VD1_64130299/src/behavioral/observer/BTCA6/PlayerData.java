package behavioral.observer.BTCA6;

import java.util.ArrayList;
import java.util.List;

public class PlayerData {
    private List<PlayerDataListener> listeners = new ArrayList<>();
    private String thoiGian;
    private int countdown;
    private double grade;

    public void addPlayerDataListener(PlayerDataListener listener) {
        listeners.add(listener);
    }

    public void setThoiGian(String newThoiGian) {
        this.thoiGian = newThoiGian;
    }

    public void setCountdown(int newCountdown) {
        this.countdown = newCountdown;
    }

    public void setGrade(double newGrade) {
        this.grade = newGrade;
        notifyPlayerDataListener();
    }

    private void notifyPlayerDataListener() {
        for(PlayerDataListener listener: listeners) {
            listener.update(thoiGian,countdown,grade);
        }
    }
}
