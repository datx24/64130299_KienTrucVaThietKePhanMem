package structual.decorator.beverage.BTB2;

import java.util.List;

public class TokenizeTest {
    public static void main(String[] args) {
        ITokenize tachTu = new TachTu
                ("Hôm nay là thứ 3 , ngày 15 tháng 10 " +
                        "năm 2024 ." +
                " Tôi đi học thực hành buổi sáng .");

        //Chỉ tách từ
        List<String> tokens = tachTu.tokenize();
        System.out.println("Chuỗi sau khi tách từ: " + tokens);

        //Loại bỏ từ dừng
        ITokenize loaiBoTuDung = new LoaiBoTuDung(tachTu);
        tokens = loaiBoTuDung.tokenize();
        System.out.println("Chuỗi sau khi loại bỏ từ dừng: " + tokens);

        //Loại bỏ dấu câu
        ITokenize loaiBoDauCau = new LoaiBoDauCau(tachTu);
        tokens = loaiBoDauCau.tokenize();
        System.out.println("Chuỗi sau khi loại bỏ dấu câu: " + tokens);
    }
}
