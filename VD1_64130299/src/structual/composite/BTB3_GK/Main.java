package structual.composite.BTB3_GK;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Tạo thư mục gốc
        Directory root = new Directory("Data (D:)", LocalDate.now());

        // Tạo thư mục con
        Directory taiLieu = new Directory("TaiLieu", LocalDate.now());
        Directory designPattern = new Directory("Design Pattern", LocalDate.now());

        // Thêm các tập tin
        File pptx1 = new File("CreationalPattern.pptx", LocalDate.now());
        File pptx2 = new File("StructuralPattern.pptx", LocalDate.now());
        File docx = new File("LapTrinhJavaCoBan.docx", LocalDate.now());
        File pdf1 = new File("LapTrinhJavaNangCao.pdf", LocalDate.now());
        File pdf2 = new File("NgonNguLapTrinhC.pdf", LocalDate.now());

        // Thêm tập tin vào thư mục
        designPattern.addItem(pptx1);
        designPattern.addItem(pptx2);
        taiLieu.addItem(designPattern);
        taiLieu.addItem(docx);
        taiLieu.addItem(pdf1);
        taiLieu.addItem(pdf2);
        root.addItem(taiLieu);

        // Hiển thị cây thư mục
        System.out.println(root.getStringTreeFolder(""));

        // In ra chỉ một đường dẫn tập tin từ thư mục "Tài liệu"
        printFilePathsInDirectory(taiLieu, "Data (D:)/TaiLieu");
        taiLieu.removeItem(pdf2);
        System.out.println("Đường dẫn ổ D sau khi xóa file pdf2 trong tài liệu:");
        // Hiển thị cây thư mục
        System.out.println(root.getStringTreeFolder(""));

        // In ra chỉ một đường dẫn tập tin từ thư mục "Tài liệu"
        printFilePathsInDirectory(taiLieu, "Data (D:)/TaiLieu");
    }

    // Phương thức để in đường dẫn tập tin trong thư mục
    private static void printFilePathsInDirectory(Directory directory, String currentPath) {
        for (BieuThuc item : directory.danhSachItems) {
            if (item instanceof File) {
                // In ra đường dẫn của tập tin
                System.out.println("Đường dẫn tập tin: " + item.getPath(currentPath));
            } else if (item instanceof Directory) {
                // Gọi đệ quy để kiểm tra thư mục con
                printFilePathsInDirectory((Directory) item, currentPath + "/" + ((Directory) item).tenThuMuc);
            }
        }
    }
}
