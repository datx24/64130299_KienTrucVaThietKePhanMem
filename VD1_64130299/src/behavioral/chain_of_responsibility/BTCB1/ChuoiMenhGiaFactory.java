package behavioral.chain_of_responsibility.BTCB1;

public abstract class ChuoiMenhGiaFactory {
        protected abstract ATM_TheoMenhGia getChuoiMenhGia(int menhGia);
        public void rutTien(int soTien,int menhGiaCaoNhat){
            ATM_TheoMenhGia chuoiMenhGia = getChuoiMenhGia(menhGiaCaoNhat);
            System.out.println("Rút số tiền: " + soTien);
            chuoiMenhGia.rutTien(soTien);
        }
}
