package behavioral.stratery.BTCC3_1;

public class MonAn {
    private String tenMonAn;
    private int soLuong;
    private double donGia;

    public MonAn(String tenMonAn, int soLuong, double donGia) {
        this.tenMonAn = tenMonAn;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "MonAn{" +
                "tenMonAn='" + tenMonAn + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    public double tinhTien() {
        return soLuong * donGia;
    }
}
