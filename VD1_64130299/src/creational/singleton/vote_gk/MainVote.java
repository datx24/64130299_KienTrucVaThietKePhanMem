package creational.singleton.vote_gk;

public class MainVote {
    public static void main(String[] args) {
        User user1 = new User("Nguyễn Xuân Đạt");
        User user2 = new User("Trần Kim Quang");
        User user3 = new User("Phạm Phước Tài");

        user1.vote(Candidate.TRUMP);
        user2.vote(Candidate.TRUMP);
        user1.vote(Candidate.TRUMP);
        user3.vote(Candidate.BIDEN);
        Election election = Election.getInstance();
        election.showResult();
    }
}
