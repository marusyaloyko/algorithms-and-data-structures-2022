package ru.mirea.practice.task4;

public class Memory {
    private final int volume;
    private final Type type;

    public Memory(int volume, Type type) {
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Memory {" + "volume=" + volume + ", type=" + type + '}';
    }
}

enum Type {
    SSD_M2, HDD, SSD,

}
