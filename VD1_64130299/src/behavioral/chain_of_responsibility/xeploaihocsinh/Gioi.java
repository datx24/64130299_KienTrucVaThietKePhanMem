package behavioral.chain_of_responsibility.xeploaihocsinh;

public class Gioi extends XepLoai{

    @Override
    public String handleRequest(float diemTrungBinh) {
        if(diemTrungBinh >= 8 && diemTrungBinh <9) {
            return "Giỏi";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(diemTrungBinh);
        }
        return "Điểm không hợp lệ";
    }
}
