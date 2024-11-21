package behavioral.iterator.BTCE3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainCE3 {
    public static void duyetMonHoc(Iterator<MonHoc> iterator) {
        while (iterator.hasNext()) {
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }

    public static void main(String[] args) {
        List<MonHoc> list = Arrays.asList(
                new MonHoc("Lập trình Android", 3),
                new MonHoc("Kiến trúc và thiết kế phần mềm",4));
        duyetMonHoc(list.iterator());
    }
}
