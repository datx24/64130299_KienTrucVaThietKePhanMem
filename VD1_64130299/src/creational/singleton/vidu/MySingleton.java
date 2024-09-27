package creational.singleton.vidu;

public class MySingleton {
    private static MySingleton intance;
    int count = 0;

    private MySingleton() {
    }

    public static MySingleton getInstance(){
        if(intance == null)
            intance = new MySingleton();
        return intance;
    }

    public void countPrint() {
        System.out.println(++count);
    }
}
