package structual.composite.BTB3;

import java.util.ArrayList;

public class Folder extends AbstractFile{
    ArrayList<AbstractFile> files;
    StringBuilder stringBuilder = new StringBuilder();

    public Folder(String name, String createdDate) {
        super(name, createdDate);
        files = new ArrayList<>();
        path = name;
    }


    @Override
    public void add(AbstractFile file) {
        if(!files.contains(file))
        {
            files.add(file);
            file.path = this.path + "\\" + file.path;
        }
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public String getTreeFolder() {
        stringBuilder.append(pre).append(name);
        for(var f: files){
            f.pre = this.pre + "..";
            stringBuilder.append("\n\t").append(f.getTreeFolder()).append("\n");
            f.pre ="";
        }
        return stringBuilder.toString();
    }
}
