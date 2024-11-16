package behavioral.template.BTCD1;

import java.util.List;

public class KhachHangThanThiet extends HoaDon{

    public KhachHangThanThiet(List<MatHang> dsHangHoa) {
        super(dsHangHoa);
    }

    @Override
    public double tinhChietKhau() {
        double tongTien = tinhTien();
        return tongTien >= 500000 ? tongTien * 0.02 : 0;
    }
}
