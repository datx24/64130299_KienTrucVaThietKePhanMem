package behavioral.chain_of_responsibility.BTCB3;

public class BacDienCaoNhat extends BacDien {
    public BacDienCaoNhat(double gia) {
        super(gia, 400, Double.MAX_VALUE);
    }

    @Override
    public BacDien bacKeTiep(BacDien bac) {
        return null;
    }

    @Override
    public void tinhTien(int sokWh, double[] tongTien) {
        int kWhTrongBac = sokWh > min ? sokWh - (int) min : 0;

        // Tính tiền cho số kWh thuộc bậc cao nhất
        if (kWhTrongBac > 0) {
            double tien = kWhTrongBac * gia;
            tongTien[0] += tien;
            System.out.println(kWhTrongBac + " kWh x " + gia + " đồng = " + tien + " đồng.");
        }
    }
}
