package behavioral.stratery.btCC3;

public class AirpayStratery implements ThanhToanStratery{
    @Override
    //Nếu tổng tiền trên 2000000 -> giảm 2%
    public double thanhToan(double tongTien) {
        if(tongTien > 2000000) {
            tongTien = tongTien * 0.98;
        }
        return tongTien;
    }
}
