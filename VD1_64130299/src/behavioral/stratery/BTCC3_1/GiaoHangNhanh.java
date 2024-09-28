package behavioral.stratery.BTCC3_1;

public class GiaoHangNhanh implements IPhuongThucGiaoHang{

    @Override
    //Tính thêm 20% phí
    public double tinhPhiGiaoHang(double tongTien) {
        return tongTien * 1.2;
    }
}
