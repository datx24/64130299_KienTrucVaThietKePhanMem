package behavioral.stratery.btCC1;

public class Context implements Tinh{
    Tinh tinhToan;

    public Context(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    @Override
    public float tinh(float a, float b) {
        return tinhToan.tinh(a,b);
    }

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }
}
