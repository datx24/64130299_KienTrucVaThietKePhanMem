package behavioral.stratery.btCC3;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private List<MatHang> danhSachMatHang;
    private ThanhToanStratery thanhToanStratery;
    private KhuyenMaiStratery khuyenMaiStratery;

    public GioHang() {
        this.danhSachMatHang = new ArrayList<>();
    }
    public void themMatHang(String ten,int soLuong,double donGia) {
        MatHang mh = new MatHang(ten, soLuong, donGia);
        danhSachMatHang.add(mh);
    }

    public void setThanhToanStratery(ThanhToanStratery thanhToanStratery) {
        this.thanhToanStratery = thanhToanStratery;
    }

    public void setKhuyenMaiStratery(KhuyenMaiStratery khuyenMaiStratery) {
        this.khuyenMaiStratery = khuyenMaiStratery;
    }

    public double tinhTongTien() {
        double tongTien = 0;
        for(MatHang mh: danhSachMatHang){
            tongTien = tongTien + mh.tinhTien();
        }
        return tongTien;
    }

    public void thanhToan() {
        double tongTien = tinhTongTien();
        System.out.println("Tổng tiền: " +tongTien);

        //Tính tiền khuyến mãi
        double tienKhuyenMai = khuyenMaiStratery != null ? khuyenMaiStratery.tinhTienKhuyenMai(tongTien) : 0;
        System.out.println("Tiền khuyến mãi: " + tienKhuyenMai);

        //Tính tiền sau khuyến mãi
        double tienSauKhuyenMai = tongTien - tienKhuyenMai;
        System.out.println("Tiền sau khuyến mãi: " + tienSauKhuyenMai);

        //Tính tiền sau khi thanh toán
        double tienSauThanhToan = thanhToanStratery != null ? thanhToanStratery.thanhToan(tienSauKhuyenMai) : tienSauKhuyenMai;
        System.out.println("Tiền sau khi thanh toán: " + tienSauThanhToan);
    }
}
