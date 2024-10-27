package creational.singleton.vote_gk;

public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void vote(Candidate candidate){
        Election election = Election.getInstance();
        election.vote(candidate,this);
    }
}
