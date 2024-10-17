package structual.composite.BTB3;

public class FileTest {
    public static void main(String[] args) {
        AbstractFile root = new Folder("Data (D:)", "2024-01-01");
        AbstractFile taiLieu = new Folder("TaiLieu", "2024-01-02");
        AbstractFile designPattern = new Folder("Design Pattern", "2024-01-03");
        AbstractFile lapTrinhJava = new Folder("Lap Trinh Java", "2024-01-04");
        AbstractFile lapTrinhThietBiDiDong = new Folder("LapTrinhThietBiDiDong", "2024-01-05");

        // Tạo file
        AbstractFile creationalPattern = new File("CreationalPattern.pptx", "2024-01-06");
        AbstractFile structuralPattern = new File("StructuralPattern.pptx", "2024-01-07");
        AbstractFile javaCoBan = new File("LapTrinhJavaCoBan.docx", "2024-01-08");
        AbstractFile javaNangCao = new File("LapTrinhJavaNangCao.pdf", "2024-01-09");
        AbstractFile ngonNguC = new File("NgonNguLapTrinhC.pdf", "2024-01-10");
        AbstractFile coBanDiDong = new File("CoBan.pptx", "2024-01-11");
        AbstractFile nangCaoDiDong = new File("NangCao.pptx", "2024-01-12");

        // Xây dựng cây thư mục
        designPattern.add(creationalPattern);
        designPattern.add(structuralPattern);

        lapTrinhJava.add(javaCoBan);
        lapTrinhJava.add(javaNangCao);
        lapTrinhJava.add(ngonNguC);

        lapTrinhThietBiDiDong.add(coBanDiDong);
        lapTrinhThietBiDiDong.add(nangCaoDiDong);

        taiLieu.add(designPattern);
        taiLieu.add(lapTrinhJava);
        taiLieu.add(lapTrinhThietBiDiDong);

        root.add(taiLieu);

        // Hiển thị cây thư mục
        System.out.println(root.getTreeFolder());
        System.out.println(javaCoBan.getPath());
        System.out.println(designPattern.getPath());
    }
}
