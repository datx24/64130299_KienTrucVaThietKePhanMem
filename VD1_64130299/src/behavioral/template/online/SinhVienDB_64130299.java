package behavioral.template.online;

import java.util.ArrayList;
import java.util.List;

public class SinhVienDB_64130299 {
    List<SinhVien_64130299> list = new ArrayList<>();

    SinhVien_64130299 findById(int id) {
        for(var sv: list) {
            if(sv.getMaSinhVien() == id);
            return sv;
        }
        return null;
    }

    public void add(SinhVien_64130299 s) {
        for(var sv: list) {
            if(sv.getMaSinhVien() == s.getMaSinhVien())
                    return;
        }
        list.add(s);
    }

    public void update(SinhVien_64130299 s) {
        for(int i = 0; i < list.size();i++) {
            if(list.get(i).getMaSinhVien() == s.getMaSinhVien()){
                list.set(i,s);
                return;
            }
        }
    }

    public void deleteById(int id) {
        for(var sv: list) {
            if(sv.getMaSinhVien() == id)
                list.remove(sv);
                return;
        }

    }
}
