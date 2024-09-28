package behavioral.stratery.BTCC3_1;

public class GiaoHangTietKiem implements IPhuongThucGiaoHang{

    @Override
    //tính thêm 10%
    public double tinhPhiGiaoHang(double tongTien) {
        return tongTien * 1.1;
    }
}
