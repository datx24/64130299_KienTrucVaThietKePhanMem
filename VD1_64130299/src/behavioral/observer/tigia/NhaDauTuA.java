package behavioral.observer.tigia;

public class NhaDauTuA implements ThayDoiTiGia{
    TiGia t;

    public NhaDauTuA(TiGia t) {
        this.t = t;
        t.attach(this);
    }

    @Override
    public void capNhat(float delta) {
        if(delta > 0){
            System.out.println("A: Bán ra");
        }
        else {
            System.out.println("A: Mua vào");
        }
    }
}
