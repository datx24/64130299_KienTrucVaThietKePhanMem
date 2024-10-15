package creational.singleton.BTA4;

public class MainA4 {
    public static void main(String[] args) {
        User user1 = new User("Nguyễn Xuân Đạt");
        User user2 = new User("Phạm Phước Tài");
        User user3 = new User("Trần Kim Quang");
        User user4 = new User("Trần Tiến Phúc");

        user1.vote("Trump");
        user2.vote("Biden");
        user3.vote("Trump");
        user3.vote("Trump");// bị trùng vote
        user4.vote("Vô danh");// vote sai đối tượng

        Election election = Election.getInstance();
        election.showResults();

    }
}
