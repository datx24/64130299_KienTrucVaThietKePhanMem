package creational.singleton.vidu.BTA4;

import java.util.HashSet;
import java.util.Set;

public class Election {
    private int trumpVotes = 0;
    private int bidenVotes = 0;
    Set<String> voters = new HashSet<>();
    private static Election instance;

    private Election() {
    }

    public static Election getInstance() {
        if(instance == null) {
            instance = new Election();
        }
        return instance;
    }

    public String vote(String candidate, User user) {
        if(voters.contains(user.getName())){
            return "You have already voted !";
        }
        switch (candidate) {
            case "Trump" :
                trumpVotes++;
                break;
            case "Biden" :
                bidenVotes++;
                break;
            default:
                return "Invalid candidate";
        }
        voters.add(user.getName());
        return "Vote successfull !";
    }

    public void showResults() {
        System.out.println("Trump votes: " + trumpVotes);
        System.out.println("Biden votes: " + bidenVotes);
    }
}
