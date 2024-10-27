package creational.builder.BTA5;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book.Builder()
                .buildTuaDe("Đắc Nhân Tâm")
                .buildSoTrang(50)
                .buildTacGia("Nguyễn Xuân Đạt")
                .buildChuong("Chương 1: Giới thiệu"," ", "Chương 2: Nội dung")
                .buildBook();
        System.out.println(book.toString());
    }
}
