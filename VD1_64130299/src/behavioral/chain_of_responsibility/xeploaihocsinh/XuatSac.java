package behavioral.chain_of_responsibility.xeploaihocsinh;

public class XuatSac extends XepLoai{

    @Override
    public String handleRequest(float diemTrungBinh) {
        if(diemTrungBinh >= 9 && diemTrungBinh <= 10) {
            return "Xuất sắc";
        } else if (nextHandler != null) {
            return nextHandler.handleRequest(diemTrungBinh);
        }
        return "Điểm không hợp lệ";
    }
}
