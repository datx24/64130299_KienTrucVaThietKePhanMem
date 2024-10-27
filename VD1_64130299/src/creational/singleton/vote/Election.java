package creational.singleton.vote;

import java.util.HashSet;
import java.util.Set;

public class Election {
    private static volatile Election instance;
    private int trumpVotes = 0;
    private int bidenVotes = 0;
    private Set<String> users = new HashSet<>(); // Sử dụng Set để tránh trùng lặp và tăng hiệu suất

    // Constructor riêng tư để ngăn tạo thể hiện từ bên ngoài
    private Election() {}

    // Singleton với Double-Checked Locking để đảm bảo thread-safe
    public static Election getInstance() {
        if (instance == null) {
            synchronized (Election.class) {
                if (instance == null) {
                    instance = new Election();
                }
            }
        }
        return instance;
    }

    // Phương thức bỏ phiếu
    public void vote(Candidate candidate, User user) {
        // Kiểm tra nếu người dùng đã bỏ phiếu
        if (!users.add(user.getName())) {
            System.out.println(user.getName() + " has already voted!");
            return;
        }

        // Tăng phiếu dựa vào ứng viên
        switch (candidate) {
            case TRUMP -> trumpVotes++;
            case BIDEN -> bidenVotes++;
            default -> System.out.println("Invalid candidate");
        }
        System.out.println(user.getName() + " has voted!");
    }

    // Phương thức hiển thị kết quả
    public void showResults() {
        System.out.println("Trump votes: " + trumpVotes);
        System.out.println("Biden votes: " + bidenVotes);
    }
}
