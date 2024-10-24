package creational.factory.pizza.transportation;

public abstract class Transportation {
    // phương tiện di chuyển
    protected int capacity; // số lượng chỗ ngồi

    // Constructor
    public Transportation(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    protected abstract void drive(); // Phương thức drive cần được định nghĩa ở lớp con
}
