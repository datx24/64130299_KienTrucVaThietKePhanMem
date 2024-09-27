package behavioral.stratery.btCC3;

public class GiamXPhanTramStratery implements KhuyenMaiStratery{
    private double x;

    public GiamXPhanTramStratery(double x) {
        this.x = x;
    }
    //Khuyễn mãi giảm x%
    @Override
    public double tinhTienKhuyenMai(double tongTien) {
        return tongTien * (x / 100);
    }
}
