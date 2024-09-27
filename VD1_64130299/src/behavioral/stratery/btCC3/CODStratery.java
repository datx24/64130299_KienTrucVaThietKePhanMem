package behavioral.stratery.btCC3;

public class CODStratery implements ThanhToanStratery{
    @Override
    //Nếu tổng tiền trên 1000000 -> giảm 5%
    public double thanhToan(double tongTien) {
        if(tongTien > 1000000) {
            tongTien = tongTien * 0.95;
        }
        return tongTien;
    }
}
