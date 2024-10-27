package creational.builder.btapon1;

public class ComputerTest {
    public static void main(String[] args) {
        Computer_gk computer_gk1 = new Computer_gk.Builder()
                .buildCPU("Intel Core I5")
                .buildROM("1 TB")
                .buildRAM("64 gb")
                .buildStorage("abc")
                .build();
        System.out.println(computer_gk1.toString());
    }
}
