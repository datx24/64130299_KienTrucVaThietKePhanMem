package behavioral.stratery.btCC1;

public class Chia implements Tinh{

    @Override
    public float tinh(float a, float b) {
        if(b == 0){
            System.out.println("Không thể chia hết cho 0");
        }
        return a/b;
    }
}
