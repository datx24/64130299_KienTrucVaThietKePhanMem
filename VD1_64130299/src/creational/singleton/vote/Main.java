package creational.singleton.vote;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Nguyễn Xuân Đạt");
        User user2 = new User("Trần Kim Quang");
        User user3 = new User("Phạm Phước Tài");
        User user4 = new User("Nguyễn Xuân Đạt 2");
        user1.vote(Candidate.BIDEN);
        user1.vote(Candidate.BIDEN);
        user1.vote(Candidate.TRUMP);
        user2.vote(Candidate.TRUMP);
        user3.vote(Candidate.TRUMP);
        user4.vote(Candidate.TRUMP);
        Election election = Election.getInstance();
        election.showResults();
    }
}
