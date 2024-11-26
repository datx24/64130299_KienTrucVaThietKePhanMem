package behavioral.chain_of_responsibility.BTCB1;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    @Override
    protected ATM_TheoMenhGia getChuoiMenhGia(int menhGia) {
        ATM_TheoMenhGia chuoi = new MenhGia(menhGia)
                .menhGiaKeTiep(new MenhGia(10)
                        .menhGiaKeTiep(new MenhGiaThapNhat(1)));
        return chuoi;
    }

}
