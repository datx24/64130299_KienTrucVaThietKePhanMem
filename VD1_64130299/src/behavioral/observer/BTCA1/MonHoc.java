package behavioral.observer.BTCA1;

public class MonHoc {
    private String ten, maMH;

    public MonHoc(String ten, String maMH) {
        this.ten = ten;
        this.maMH = maMH;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "ten='" + ten + '\'' +
                ", maMH='" + maMH + '\'' +
                '}';
    }
}
