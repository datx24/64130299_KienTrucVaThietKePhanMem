package behavioral.observer.tigia;

public class NhaDauTuB implements ThayDoiTiGia{
    TiGia t;

    public NhaDauTuB(TiGia t) {
        this.t = t;
        t.attach(this);
    }

    @Override
    public void capNhat(float delta) {
        if(delta > 0){
            System.out.println("B: Mua vào");
        }
        else {
            System.out.println("B: Bán ra");
        }
    }
}
