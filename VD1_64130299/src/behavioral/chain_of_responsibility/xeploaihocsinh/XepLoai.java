package behavioral.chain_of_responsibility.xeploaihocsinh;

public abstract class XepLoai {
    protected XepLoai nextHandler;

    public void setNextHandler(XepLoai nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract String handleRequest(float diemTrungBinh);
}
