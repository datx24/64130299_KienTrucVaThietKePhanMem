package structual.composite.BTB3_GK;

import java.time.LocalDate;


public class File extends BieuThuc {
    protected String tenFile;
    protected LocalDate ngayTao;

    public File(String tenFile, LocalDate ngayTao) {
        this.tenFile = tenFile;
        this.ngayTao = ngayTao;
    }

    @Override
    public String getStringTreeFolder(String prefix) {
        return prefix + "File: " + tenFile + "\n";
    }

    @Override
    public String getPath(String currentPath) {
        return currentPath + "/" + tenFile; // Xây dựng đường dẫn từ đường dẫn hiện tại
    }

    @Override
    public void addItem(BieuThuc item) {
    }

    @Override
    public void removeItem(BieuThuc item) {
    }

    @Override
    public String toString() {
        return "File{" + "tenFile='" + tenFile + '\'' + ", ngayTao=" + ngayTao + '}';
    }
}


