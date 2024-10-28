package structual.composite.BTB3_64130299;

public abstract class AbstractFile {
    public abstract String getStringTreeFolder(String prefix);
    public abstract String getPath(String currentPath);
    public abstract void addItem(AbstractFile item);
    public abstract void removeItem(AbstractFile item);
}
