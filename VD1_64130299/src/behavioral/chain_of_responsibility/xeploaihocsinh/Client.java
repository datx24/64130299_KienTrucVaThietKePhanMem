package behavioral.chain_of_responsibility.xeploaihocsinh;

public class Client {
    private XepLoai handleChain;

    public Client(XepLoai handleChain) {
        this.handleChain = handleChain;
    }

    public void processXepLoai(float diemTrungBinh) {
        String result = handleChain.handleRequest(diemTrungBinh);
        System.out.println("Điêm trung bình: " + diemTrungBinh + " -> Xếp loại: " + result);
    }
}
