package structual.composite.BTB3_GK;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directory extends BieuThuc {
    protected String tenThuMuc;
    protected LocalDate ngayTao;
    protected List<BieuThuc> danhSachItems;

    public Directory(String tenThuMuc, LocalDate ngayTao) {
        this.tenThuMuc = tenThuMuc;
        this.ngayTao = ngayTao;
        this.danhSachItems = new ArrayList<>();
    }

    @Override
    public String getStringTreeFolder(String prefix) {
        StringBuilder tree = new StringBuilder(prefix + "Thư mục: " + tenThuMuc + "\n");
        String newPrefix = prefix + "  "; // Tạo khoảng trắng cho cấp độ con
        for (BieuThuc item : danhSachItems) {
            tree.append(item.getStringTreeFolder(newPrefix));
        }
        return tree.toString();
    }

    @Override
    public String getPath(String currentPath) {
        String newPath = currentPath + "/" + tenThuMuc; // Xây dựng đường dẫn
        for (BieuThuc item : danhSachItems) {
            newPath = item.getPath(newPath);
        }
        return newPath; // Trả về đường dẫn đầy đủ
    }

    @Override
    public void addItem(BieuThuc item) {
        danhSachItems.add(item);
    }

    @Override
    public void removeItem(BieuThuc item) {
        danhSachItems.remove(item);
    }

    @Override
    public String toString() {
        return "Directory{" + "tenThuMuc='" + tenThuMuc + '\'' + ", ngayTao=" + ngayTao + '}';
    }
}


