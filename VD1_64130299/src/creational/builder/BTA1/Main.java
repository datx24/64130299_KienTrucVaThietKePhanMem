package creational.builder.BTA1;

public class Main {
    public static void main(String[] args) {
        HoaDonHeader hd1 = new HoaDonHeader("HD0001","12/12/2024","Trần Tiến Phúc");
        CTHD cthd1 = new CTHD("Chuối",5, 123000,0.1F);
        CTHD cthd2 = new CTHD("Táo",3,14000,0.5F);

        HoaDon hoaDon = new HoaDon.Builder()
                .addHoaDonHeader(hd1)
                .addCTHD(cthd1)
                .addCTHD(cthd2)
                .build();
        System.out.println(hoaDon);
    }
}
