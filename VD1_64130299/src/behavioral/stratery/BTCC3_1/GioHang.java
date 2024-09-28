package behavioral.stratery.BTCC3_1;

import behavioral.stratery.btCC3.MatHang;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private  List<MonAn> danhSachMonAn;
    private IPhuongThucGiaoHang phuongThucGiaoHang;
    private IHinhThucKhuyenMai hinhThucKhuyenMai;

    public GioHang() {
        this.danhSachMonAn = new ArrayList<>();
    }

    void themMonAn(String tenMonAn, int soLuong, double donGia) {
        MonAn ma = new MonAn(tenMonAn, soLuong,donGia);
            danhSachMonAn.add(ma);
    }

    public void setPhuongThucGiaoHang(IPhuongThucGiaoHang phuongThucGiaoHang) {
        this.phuongThucGiaoHang = phuongThucGiaoHang;
    }

    public void setHinhThucKhuyenMai(IHinhThucKhuyenMai hinhThucKhuyenMai) {
        this.hinhThucKhuyenMai = hinhThucKhuyenMai;
    }

    public double tinhTongTien() {
        double tongTien = 0;
        for(MonAn ma: danhSachMonAn){
            tongTien = tongTien + ma.tinhTien();
        }
        return tongTien;
    }

    public void thanhToan() {
        //Tính tổng tiền
        double tongTien = tinhTongTien();
        System.out.println("Tổng tiền: " + tongTien);

        //Tính tiền khuyến mãi
        double tienKhuyenMai = hinhThucKhuyenMai != null ? hinhThucKhuyenMai.tinhTienKhuyenMai(tongTien) : 0;
        System.out.println("Tiền khuyến mãi: " + tienKhuyenMai);

        //Tính tiền sau khuyến mãi
        double tienSauKhuyenMai = tongTien - tienKhuyenMai;
        System.out.println("Tiền sau khuyến mãi: " + tienSauKhuyenMai);

        //Tính phí giao hàng
        double phiGiaoHang = phuongThucGiaoHang.tinhPhiGiaoHang(tongTien);
        System.out.println("Phí giao hàng: " + phiGiaoHang);

        //Tính sau khi chọn khuyến mãi và hình thức giao hàng
        double tienThanhToan = tienSauKhuyenMai + phiGiaoHang;
        System.out.println("Tiền thanh toán: " +tienThanhToan);

    }
}
