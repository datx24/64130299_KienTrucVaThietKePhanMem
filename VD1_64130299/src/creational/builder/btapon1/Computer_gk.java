package creational.builder.btapon1;

public class Computer_gk {
    String cpu,ram,rom,storage;

    protected Computer_gk(Builder b) {
        this.cpu = b.cpu;
        this.ram = b.ram;
        this.rom = b.rom;
        this.storage = b.storage;
    }

    @Override
    public String toString() {
        return "Computer_gk{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", rom='" + rom + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }

    public static class Builder {
        String cpu,ram,rom,storage;
        public Builder buildCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder buildRAM(String ram) {
            this.ram = ram;
            return this;
        }
        public Builder buildROM(String rom) {
            this.rom = rom;
            return this;
        }
        public Builder buildStorage(String storage) {
            this.storage = storage;
            return this;
        }
        public Computer_gk build() {
            return new Computer_gk(this);
        }
    }
}
