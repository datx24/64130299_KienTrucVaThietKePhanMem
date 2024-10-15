package creational.builder.BTA1;

public class HoaDonHeader {
    String soHD,ngayBan,tenKH;

    public HoaDonHeader(String soHD, String ngayBan, String tenKH) {
        this.soHD = soHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" +
                "soHD='" + soHD + '\'' +
                ", ngayBan='" + ngayBan + '\'' +
                ", tenKH='" + tenKH + '\'' +
                '}';
    }
}
