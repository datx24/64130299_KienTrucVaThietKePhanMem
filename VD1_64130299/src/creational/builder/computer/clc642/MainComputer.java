package creational.builder.computer.clc642;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .buildCPU("Intel Arrow Lake Ultra")
                .buildRAM("190GB RAM Samsung")
                .buildStorage("100TB SSD Samsung Revo")
                .buildScreen("LG 24 inch 4k")
                .build();
        System.out.println(computer.toString());
    }
}
