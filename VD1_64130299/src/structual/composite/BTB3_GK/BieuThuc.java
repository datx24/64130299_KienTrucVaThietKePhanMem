package structual.composite.BTB3_GK;

public abstract class BieuThuc {
    public abstract String getStringTreeFolder(String prefix);
    public abstract String getPath(String currentPath);
    public abstract void addItem(BieuThuc item);
    public abstract void removeItem(BieuThuc item);
}


