package structual.composite.BTB3_64130299;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    protected String tenThuMuc, ngayTao;
    protected List<AbstractFile> danhSachItems;

    public Folder(String tenThuMuc, String ngayTao) {
        this.tenThuMuc = tenThuMuc;
        this.ngayTao = ngayTao;
        this.danhSachItems = new ArrayList<>();
    }

    @Override
    public String getStringTreeFolder(String prefix) {
        StringBuilder tree = new StringBuilder(prefix + "Thư mục: " + tenThuMuc + "\n");
        String newPrefix = prefix + " ";
        for(AbstractFile item: danhSachItems) {
            tree.append(item.getStringTreeFolder(newPrefix));
        }
        return tree.toString();
    }

    @Override
    public String getPath(String currentPath) {
        String newPath = currentPath + "/" + tenThuMuc;
        for(AbstractFile item: danhSachItems) {
            newPath = item.getPath(newPath);
        }
        return newPath;
    }

    @Override
    public void addItem(AbstractFile item) {
        danhSachItems.add(item);
    }

    @Override
    public void removeItem(AbstractFile item) {
        danhSachItems.remove(item);
    }

    @Override
    public String toString() {
        return "Folder{" +
                "tenThuMuc='" + tenThuMuc + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                ", danhSachItems=" + danhSachItems +
                '}';
    }
}
