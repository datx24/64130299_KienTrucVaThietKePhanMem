package behavioral.iterator.BTTLIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainBTTL {
    public static void duyetMonHoc(Iterator<MonHoc> iterator) {
        while (iterator.hasNext()) {
            MonHoc mh = iterator.next();
            System.out.println(mh.toString());
        }
    }

    public static void main(String[] args) {
        List<MonHoc> danhSachMonHoc = Arrays.asList(
                new MonHoc("MH001","Toán"),
                new MonHoc("MH002","Văn")
        );

        duyetMonHoc(danhSachMonHoc.iterator());
    }
}
