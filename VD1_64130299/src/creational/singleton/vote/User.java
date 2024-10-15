package creational.singleton.vote;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void vote(Candidate candidate) {
        Election election = Election.getInstance();
        election.vote(candidate,this);
    }
}
