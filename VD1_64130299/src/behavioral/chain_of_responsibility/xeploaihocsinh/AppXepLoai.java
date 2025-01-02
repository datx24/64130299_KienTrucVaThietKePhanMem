package behavioral.chain_of_responsibility.xeploaihocsinh;

public class AppXepLoai {
    public static void main(String[] args) {
        XepLoai yeu = new Yeu();
        XepLoai trungBinh = new TrungBinh();
        XepLoai kha = new Kha();
        XepLoai gioi = new Gioi();
        XepLoai xuatSac = new XuatSac();

        yeu.setNextHandler(trungBinh);
        trungBinh.setNextHandler(kha);
        kha.setNextHandler(gioi);
        gioi.setNextHandler(xuatSac);

        Client client = new Client(yeu);

        float [] danhSachDiem = {3.5f,5.5f,7.2f,8.6f,9.7f,11f};

        for(float diemTrungBinh: danhSachDiem) {
            client.processXepLoai(diemTrungBinh);
        }
    }
}
