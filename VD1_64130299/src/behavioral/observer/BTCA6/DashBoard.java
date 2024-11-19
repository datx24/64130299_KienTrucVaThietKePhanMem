package behavioral.observer.BTCA6;

public class DashBoard implements PlayerDataListener{
    private String thoiGian;
    private int countdown;
    private double grade;
    @Override
    public void update(String thoiGian, int countdown, double grade) {
        this.thoiGian = thoiGian;
        this.countdown = countdown;
        this.grade = grade;
        display();
    }

    public void display() {
        System.out.println("=== THÔNG TIN NHÂN VẬT ===");
        System.out.println("Thời gian: " + thoiGian);
        System.out.println("Số lượt chơi: " + countdown);
        System.out.println("Điểm số: " + grade);
        System.out.println("===========================");
    }
}
