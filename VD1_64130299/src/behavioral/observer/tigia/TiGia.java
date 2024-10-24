package behavioral.observer.tigia;

import java.util.ArrayList;
import java.util.List;

public class TiGia {
    List<ThayDoiTiGia> obsevers = new ArrayList<>();
    public void attach(ThayDoiTiGia o){
        obsevers.add(o);
    }
    public void detach(ThayDoiTiGia o){
        obsevers.remove(o);
    }
    public void notify(Float delta){
        for(var o: obsevers){
            o.capNhat(delta);
        }
    }
}
