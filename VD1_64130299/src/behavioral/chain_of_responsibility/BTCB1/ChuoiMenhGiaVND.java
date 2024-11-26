package behavioral.chain_of_responsibility.BTCB1;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory{
    @Override
    protected ATM_TheoMenhGia getChuoiMenhGia(int menhGia) {
        ATM_TheoMenhGia chuoiMenhGia =
                new MenhGia(500).
                        menhGiaKeTiep(new MenhGia(200)).
                            menhGiaKeTiep(new MenhGia(100)).
                                menhGiaKeTiep(new MenhGia(50)).
                                    menhGiaKeTiep(new MenhGia(20)).
                                        menhGiaKeTiep(new MenhGia(10)).
                                            menhGiaKeTiep(new MenhGiaThapNhat(1));
        return chuoiMenhGia;
    }
}
