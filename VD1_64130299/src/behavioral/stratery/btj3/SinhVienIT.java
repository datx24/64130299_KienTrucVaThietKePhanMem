package behavioral.stratery.btj3;

public class SinhVienIT extends SinhVienNTU{
    private float diemJava, diemCSS, diemHTML;

    public SinhVienIT(String hoTen, String nganh, float diemJava, float diemCSS, float diemHTML) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCSS = diemCSS;
        this.diemHTML = diemHTML;
    }

    public float getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(float diemJava) {
        this.diemJava = diemJava;
    }

    public float getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(float diemCSS) {
        this.diemCSS = diemCSS;
    }

    public float getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(float diemHTML) {
        this.diemHTML = diemHTML;
    }

    @Override
    public float getDiemTB() {
        return(diemJava * 2 + diemCSS + diemHTML)/4;
    }
}
