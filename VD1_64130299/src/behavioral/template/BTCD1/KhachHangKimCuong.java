package behavioral.template.BTCD1;

import java.util.List;

public class KhachHangKimCuong extends HoaDon{

    public KhachHangKimCuong(List<MatHang> dsHangHoa) {
        super(dsHangHoa);
    }

    @Override
    public double tinhChietKhau() {
        double tongTien = tinhTien();
        if(tongTien >= 500000) return tongTien * 0.03;
        if(tongTien >= 1000000) return tongTien * 0.05;
        if(tongTien >= 1500000) return tongTien * 0.06;
        return 0;
    }
}
