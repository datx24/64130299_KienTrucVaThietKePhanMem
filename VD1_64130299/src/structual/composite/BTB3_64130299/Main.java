package structual.composite.BTB3_64130299;

public class Main {
    public static void main(String[] args) {
        //Tạo thư mục gốc
        Folder root = new Folder("(E:) ","28/10/2024");
        //Tạo thư mục con
        Folder taiLieu = new Folder("TaiLieu","28/10/2024");
        Folder anhDaiDien = new Folder("AnhDaiDien", "28/10/2024");

        //Tạo file
        File file1 = new File("file1.ppt","28/10/2024");
        File file2 = new File("file2.ppt","28/10/2024");
        File file3 = new File("file3.ppt","28/10/2024");
        File file4 = new File("file4.ppt","28/10/2024");

        taiLieu.addItem(file1);
        taiLieu.addItem(file2);
        taiLieu.addItem(file3);
        taiLieu.addItem(file4);
        root.addItem(taiLieu);
        root.addItem(anhDaiDien);

        //Hiển thị cây thư mục
        System.out.println(root.getStringTreeFolder(""));
        inDuongDan(taiLieu,("(E:)/TaiLieu"));
    }
    //Phương thức in 1 đường dẫn
    private static void inDuongDan(Folder folder,String curentPath) {
        for(AbstractFile item: folder.danhSachItems) {
            //Nếu item đó là file thì in luôn đường dẫn
            if(item instanceof File) {
                System.out.println("Đương dẫn tập tin: " + item.getPath(curentPath));
            }
            //Nếu item đó là folder thì gọi đệ quy
            else if(item instanceof Folder) {
                inDuongDan((Folder) item,curentPath + "/" + ((Folder) item).tenThuMuc);
            }
        }
    }
}
