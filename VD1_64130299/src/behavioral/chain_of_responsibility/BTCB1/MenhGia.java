package behavioral.chain_of_responsibility.BTCB1;

class MenhGia extends ATM_TheoMenhGia {

    public MenhGia(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public ATM_TheoMenhGia menhGiaKeTiep(ATM_TheoMenhGia m) {
        this.keTiep = m;
        return this;
    }

    @Override
    public void rutTien(int soTien) {
        if (soTien >= menhGia) {
            int soTo = soTien / menhGia;
            int soDu = soTien % menhGia;

            System.out.println(soTo + " tờ mệnh giá " + menhGia);

            if (soDu > 0 && keTiep != null) {
                keTiep.rutTien(soDu);
            }
        } else if (keTiep != null) {
            keTiep.rutTien(soTien); // Chuyển số tiền nhỏ hơn mệnh giá cho thành phần kế tiếp
        }
    }

}