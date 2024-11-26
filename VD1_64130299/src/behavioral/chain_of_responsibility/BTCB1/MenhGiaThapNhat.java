package behavioral.chain_of_responsibility.BTCB1;

class MenhGiaThapNhat extends ATM_TheoMenhGia {

    public MenhGiaThapNhat(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m) {
        return this;
    }

    @Override
    public void rutTien(int soTien) {
        if (soTien > 0) {
            int soTo = soTien / menhGia;
            System.out.println(soTo + " tờ mệnh giá " + menhGia);
        }
    }
}
