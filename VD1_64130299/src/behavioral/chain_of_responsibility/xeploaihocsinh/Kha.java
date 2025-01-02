package behavioral.chain_of_responsibility.xeploaihocsinh;

public class Kha extends XepLoai{

    @Override
    public String handleRequest(float diemTrungBinh) {
        if(diemTrungBinh >= 7 && diemTrungBinh < 8) {
            return "Khá";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(diemTrungBinh);
        }
        return "Điểm không hợp lệ";
    }
}
