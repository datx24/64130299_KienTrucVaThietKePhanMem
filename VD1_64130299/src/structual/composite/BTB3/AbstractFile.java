package structual.composite.BTB3;

public abstract class AbstractFile {
    String name, createdDate, path;
    String pre;
    public AbstractFile(String name, String createdDate) {
        this.name = name;
        this.createdDate = createdDate;
        this.path = name;
    }

    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public String getPath() {
        return path;
    }
    public abstract String getTreeFolder();

}
