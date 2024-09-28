package behavioral.stratery.BTCC3_1;

public class GiamXTrenTongSoTien implements IHinhThucKhuyenMai{
    double x;

    public GiamXTrenTongSoTien(double x) {
        this.x = x;
    }

    @Override
    public double tinhTienKhuyenMai(double tongTien) {
        return tongTien * (x/100);
    }
}
