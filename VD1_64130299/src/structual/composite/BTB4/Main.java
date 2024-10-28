package structual.composite.BTB4;

public class Main {
    public static void main(String[] args) {
        // Tạo các môn học
        MonHoc mon1 = new MonHocCuaSV("Toán", 3, 1500000);
        MonHoc mon2 = new MonHocCuaSV("Lý", 4, 2000000);
        MonHoc mon3 = new MonHocCuaSV("Hóa", 3, 1500000);

        // Tạo kỳ học
        KyHoc ky1 = new KyHoc("Kỳ 1");
        ky1.themMon(mon1);
        ky1.themMon(mon2);

        KyHoc ky2 = new KyHoc("Kỳ 2");
        ky2.themMon(mon3);

        // Tạo năm học
        NamHoc namHoc1 = new NamHoc("Năm 1");
        namHoc1.themKy(ky1);
        namHoc1.themKy(ky2);

        // Tạo khóa học
        KhoaHoc khoaHoc = new KhoaHoc("Khóa học CNTT");
        khoaHoc.themNam(namHoc1);

        // Hiển thị thông tin khóa học
        System.out.println(khoaHoc);
    }
}


