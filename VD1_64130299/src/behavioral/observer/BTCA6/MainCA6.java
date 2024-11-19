package behavioral.observer.BTCA6;

public class MainCA6 {
    public static void main(String[] args) {
        PlayerData playerData1 = new PlayerData();
        DashBoard dashBoard1 = new DashBoard();

        playerData1.addPlayerDataListener(dashBoard1); //đăng kí dashboard làm obsserver
        System.out.println("** Cập nhật lần 1");
        playerData1.setThoiGian("120 giây");
        playerData1.setCountdown(5);
        playerData1.setGrade(1000.0);
        System.out.println("** Cập nhật lần 2");
        playerData1.setThoiGian("1200 giây");
        playerData1.setCountdown(599);
        playerData1.setGrade(1700.0);
    }
}
