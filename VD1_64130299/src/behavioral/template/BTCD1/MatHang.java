package behavioral.template.BTCD1;

public class MatHang {
    private String ten;
    private int soLuong;
    private double donGia;

    public MatHang(String ten, int soLuong, double donGia) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return "MatHang{" +
                "ten='" + ten + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}
