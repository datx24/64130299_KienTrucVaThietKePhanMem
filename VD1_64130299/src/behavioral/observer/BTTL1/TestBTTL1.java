package behavioral.observer.BTTL1;

public class TestBTTL1 {
    public static void main(String[] args) {
        DataAccess dataAccess = DataAccess.getInstance();
        Stream<MonHoc> stream = dataAccess.getStream();

        Client client = new Client("Client");

        stream.addListener(client);

        dataAccess.themMonHoc(new MonHoc("T","Toán"));
        dataAccess.themMonHoc(new MonHoc("V","Văn"));
    }
}
