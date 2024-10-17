package structual.composite.BTB3;

public class File extends AbstractFile{

    public File(String name, String createdDate) {
        super(name, createdDate);
        this.path = name;
    }

    @Override
    public void add(AbstractFile file) {

    }

    @Override
    public void remove(AbstractFile file) {

    }

    @Override
    public String getTreeFolder() {
        return pre+name;
    }
}
