package behavioral.chain_of_responsibility.BTCB3;

public class BacDienThuong extends BacDien {
    public BacDienThuong(double gia, double min, double max) {
        super(gia, min, max);
    }

    @Override
    public BacDien bacKeTiep(BacDien bac) {
        this.bacKeTiep = bac;
        return bac;
    }

    @Override
    public void tinhTien(int sokWh, double[] tongTien) {
        int kWhTrongBac = 0;

        // Tính số kWh thuộc phạm vi của bậc hiện tại
        if (sokWh > min) {
            kWhTrongBac = (int) Math.min(sokWh, max) - (int) min;
        }

        // Tính tiền cho số kWh thuộc bậc
        if (kWhTrongBac > 0) {
            double tien = kWhTrongBac * gia;
            tongTien[0] += tien;
            System.out.println(kWhTrongBac + " kWh x " + gia + " đồng = " + tien + " đồng.");
        }

        // Gửi số kWh còn dư cho bậc kế tiếp
        if (sokWh > max && bacKeTiep != null) {
            bacKeTiep.tinhTien(sokWh, tongTien);
        }
    }
}
