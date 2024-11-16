package behavioral.observer.BTCA1;

import java.util.ArrayList;
import java.util.List;

public class Client implements Listener<MonHoc>{
    private List<MonHoc> dsMonHoc = new ArrayList<>();
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(MonHoc event) {
        System.out.printf("%s nhận thông báo:\n", name);
        dsMonHoc.add(event);
        hienThiDanhSach();
    }

    private void hienThiDanhSach() {
        System.out.println("Danh sách môn học: ");
        dsMonHoc.forEach(System.out::println);
    }
}
