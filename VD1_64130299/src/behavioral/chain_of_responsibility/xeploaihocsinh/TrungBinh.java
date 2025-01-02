package behavioral.chain_of_responsibility.xeploaihocsinh;

public class TrungBinh extends XepLoai{
    @Override
    public String handleRequest(float diemTrungBinh) {
        if(diemTrungBinh >= 5 && diemTrungBinh < 7) {
            return "Trung bình";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(diemTrungBinh);
        }
        return "Điểm không hợp lệ";
    }
}
