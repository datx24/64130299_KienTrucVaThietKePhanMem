package creational.builder.BTA1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader hoaDonHeader;
    private List<CTHD> cthds;

    private HoaDon(Builder builder) {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.cthds = builder.cthds;
    }

    public static class Builder{
        private HoaDonHeader hoaDonHeader;
        private List<CTHD> cthds = new ArrayList<>();

        public Builder addHoaDonHeader(HoaDonHeader hoaDonHeader) {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }

        public Builder addCTHD(CTHD cthd) {
            this.cthds.add(cthd);
            return this;
        }

        public HoaDon build() {
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Hóa Đơn: \n");
        result.append(hoaDonHeader.toString() + "\n");
        result.append("Chi tiết hóa đơn:\n");
        for (CTHD cthd : cthds) {
            result.append(cthd.toString() + "\n");
        }
        return result.toString();
    }
}
