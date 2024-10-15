package creational.singleton.vote;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int trump = 0, biden = 0;
    private List<String> users = new ArrayList<>(); // Initialize list in the constructor

    private Election() {// Initialize the list
    }

    public static Election getInstance() {
        if (instance == null) {
            instance = new Election();
        }
        return instance;
    }

    public void vote(Candidate candidate, User user) {
        // Check if the user has already voted
        if (users.contains(user.getName())) {
            System.out.println(user.getName() + " has already voted!"); // Space between name and message
            return;
        }

        // Increment vote count based on the candidate
        switch (candidate) {
            case TRUMP:
                trump++;
                break;
            case BIDEN:
                biden++;
                break;
            default:
                System.out.println("Invalid candidate");
                return;
        }

        // Add user to the list of people who have voted
        users.add(user.getName());
        System.out.println(user.getName() + " has voted !");
    }

    public void showResults() {
        System.out.println("Trump votes: " + trump);
        System.out.println("Biden votes: " + biden);
    }
}
