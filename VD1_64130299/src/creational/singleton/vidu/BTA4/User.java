package creational.singleton.vidu.BTA4;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void vote(String candidate) {
        Election election = Election.getInstance();
        String result = election.vote(candidate,this);
        System.out.println(result);
    }
}
