package creational.builder.BTA5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    String tuaDe;
    int soTrang;
    String tacGia;
    List<String> danhSachCacChuong = new ArrayList<>();

    protected Book(Builder b) {
        this.tuaDe = b.tuaDe;
        this.soTrang = b.soTrang;
        this.tacGia = b.tacGia;
        this.danhSachCacChuong = b.danhSachCacChuong;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tuaDe='" + tuaDe + '\'' +
                ", soTrang=" + soTrang +
                ", tacGia='" + tacGia + '\'' +
                ", danhSachCacChuong=" + danhSachCacChuong +
                '}';
    }

    public static class Builder {
        String tuaDe;
        int soTrang;
        String tacGia;
        List<String> danhSachCacChuong = new ArrayList<>();

        public Builder buildTuaDe(String tuaDe) {
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder buildSoTrang(int soTrang) {
            this.soTrang = soTrang;
            return this;
        }
        public Builder buildTacGia(String tacGia) {
            this.tacGia = tacGia;
            return this;
        }
//        public Builder buildChuong(String... chuongs) {
//            for(String chuong: chuongs) {
//                this.danhSachCacChuong.add(chuong);
//            }
//            return this;
//        }

        public Builder buildChuong(String... chuongs) {
            Arrays.stream(chuongs)
                    .filter(chuong -> chuong != null && !chuong.trim().isEmpty())  // Bỏ qua chương rỗng bằng trim()
                    .forEach(this.danhSachCacChuong::add);
            return this;
        }

        public Book buildBook() {
            return new Book(this);
        }
    }
}
