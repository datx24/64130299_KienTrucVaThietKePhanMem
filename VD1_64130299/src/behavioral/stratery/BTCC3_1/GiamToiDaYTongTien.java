package behavioral.stratery.BTCC3_1;

public class GiamToiDaYTongTien implements IHinhThucKhuyenMai{
    double y;

    public GiamToiDaYTongTien(double y) {
        this.y = y;
    }
    //Được giảm 20 % trên tổng tiền, nhưng không được vượt quá y số tiền
    @Override
    public double tinhTienKhuyenMai(double tongTien) {
        return Math.min(y,tongTien*0.2);
    }
}
