package behavioral.chain_of_responsibility.xeploaihocsinh;

public class Yeu extends XepLoai{
    @Override
    public String handleRequest(float diemTrungBinh) {
        if (diemTrungBinh >= 0 && diemTrungBinh < 5) {
            return "Yếu";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(diemTrungBinh);
        }
        return "Điểm không hợp lệ";
    }
}
