package behavioral.observer.BTTL1;

import java.util.ArrayList;
import java.util.List;

public class Client implements Listener<MonHoc>{
    private List<MonHoc> danhSachMonHoc = new ArrayList<>();
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(MonHoc mh) {
        System.out.printf("%s nhận thông báo:\n", name);
        danhSachMonHoc.add(mh);
        hienThiDanhSach();
    }
    void hienThiDanhSach () {
        System.out.println("Danh sách môn học: ");
        danhSachMonHoc.forEach(System.out::println);
    }
}
