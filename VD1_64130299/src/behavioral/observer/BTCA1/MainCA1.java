package behavioral.observer.BTCA1;

public class MainCA1 {
    public static void main(String[] args) {
        DataAccess dataAccess = DataAccess.getInstance();
        Stream<MonHoc> stream = dataAccess.getStream();

        Client client1 = new Client("Client 1");
        Client client2 = new Client("Client 2");

        stream.addListener(client1);
        stream.addListener(client2);

        dataAccess.themMonHoc(new MonHoc("Toán","101"));
        dataAccess.themMonHoc(new MonHoc("Lý","102"));
    }
}
