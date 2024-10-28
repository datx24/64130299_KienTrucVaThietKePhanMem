package structual.composite.BTB3_64130299;

public class File extends AbstractFile{

    protected String tenFile, ngayTao;

    public File(String tenFile, String ngayTao) {
        this.tenFile = tenFile;
        this.ngayTao = ngayTao;
    }

    @Override
    public String getStringTreeFolder(String prefix) {
        return prefix + "File: " + tenFile + '\n';
    }

    @Override
    public String getPath(String currentPath) {
        return currentPath + "/" + tenFile;
    }

    @Override
    public void addItem(AbstractFile item) {

    }

    @Override
    public void removeItem(AbstractFile item) {

    }

    @Override
    public String toString() {
        return "File{" +
                "tenFile='" + tenFile + '\'' +
                ", ngayTao='" + ngayTao + '\'' +
                '}';
    }
}
