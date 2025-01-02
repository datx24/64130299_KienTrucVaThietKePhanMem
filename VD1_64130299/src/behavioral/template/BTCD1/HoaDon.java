package behavioral.template.BTCD1;

import java.util.List;

public abstract class HoaDon {
    protected List<MatHang> dsHangHoa;

    public HoaDon(List<MatHang> dsHangHoa) {
        this.dsHangHoa = dsHangHoa;
    }

    public double tinhTien() {
        double tongTien = 0;
        for(MatHang matHang: dsHangHoa) {
            tongTien += matHang.tinhThanhTien();
        }
        return tongTien;
    }
    public abstract double tinhChietKhau() ;
    public void hienThiGioHang() {
        System.out.println("Danh sách hàng hóa: ");
        dsHangHoa.forEach(System.out::println);
        double tongTien = tinhTien();//chưa tính chiết khấu
        double tienChietKhau = tinhChietKhau();
        double tienThanhToan = tongTien - tienChietKhau;
        System.out.println("Tổng tiền: " + tongTien);
        System.out.println("Tiền chiết khấu: " + tienChietKhau);
        System.out.println("Tiền thanh toán: " + tienThanhToan);
    }

    public final void templateMethod() {
        hienThiGioHang();
    }
}
