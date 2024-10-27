package creational.singleton.vote_gk;

import java.util.HashSet;
import java.util.Set;

public class Election {
    private int trumpVotes, bidenVotes;
    private Set<String> voters = new HashSet<>();
    private static Election instance;

    private Election() {
    }

    public static Election getInstance() {
        if (instance == null) {
            instance = new Election();
        }
        return instance;
    }

    public void vote(Candidate candidate, User user) {
        // Kiểm tra nếu người dùng đã bỏ phiếu trước đó
        if (!voters.add(user.getName())) {
            System.out.println(user.getName() + " has already voted!");
        }
        // Bỏ phiếu cho ứng cử viên
        switch (candidate) {
            case TRUMP -> trumpVotes++;
            case BIDEN -> bidenVotes++;
            default -> {
                System.out.println("Invalid candidate");
            }
        }
        // Thêm tên người dùng vào danh sách đã bỏ phiếu
        voters.add(user.getName());
        System.out.println(user.getName() + " vote successful.");
    }


    public void showResult() {
        System.out.println("Trump votes: "+trumpVotes);
        System.out.println("Biden votes: "+bidenVotes);
    }
}
