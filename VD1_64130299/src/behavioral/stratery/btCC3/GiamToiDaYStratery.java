package behavioral.stratery.btCC3;

public class GiamToiDaYStratery implements KhuyenMaiStratery{
    private double y;

    public GiamToiDaYStratery(double y) {
        this.y = y;
    }
    // khuyến mãi giảm tối đa y VND
    @Override
    public double tinhTienKhuyenMai(double tongTien) {
        return Math.min(y, tongTien * 0.1);
    }
}
