package behavioral.template.BTCD1;

import java.util.List;

public class KhachHangVang extends HoaDon{

    public KhachHangVang(List<MatHang> dsHangHoa) {
        super(dsHangHoa);
    }

    @Override
    public double tinhChietKhau() {
        double tongTien = tinhTien();
        if(tongTien >= 500000) return tongTien * 0.03;
        if(tongTien >= 1000000) return tongTien * 0.05;
        return 0;
    }
}
