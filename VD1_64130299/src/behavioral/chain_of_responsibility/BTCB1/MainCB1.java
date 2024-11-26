package behavioral.chain_of_responsibility.BTCB1;

public class MainCB1 {
    public static void main(String[] args) {
        ATM_TheoMenhGia atm = new MenhGia(500)
                .menhGiaKeTiep(new MenhGia(100)
                        .menhGiaKeTiep(new MenhGia(50)
                                .menhGiaKeTiep(new MenhGia(10)
                                        .menhGiaKeTiep(new MenhGiaThapNhat(1)))));
        System.out.println("Rút số tiền 293: ");
        atm.rutTien(299);
        ChuoiMenhGiaFactory chuoiVND = new ChuoiMenhGiaVND();
        chuoiVND.rutTien(299, 50);
    }
}
