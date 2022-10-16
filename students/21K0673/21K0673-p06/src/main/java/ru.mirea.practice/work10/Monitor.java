package ru.mirea.practice.work10;

public class Monitor extends Computer {
    int framerate;
    double size;

    public Monitor(EnumComputer company_name, double cost, int framerate, double size) {
        this.companyName = company_name;
        this.cost = cost;
        this.framerate = framerate;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Memory:{Framerate= " + framerate + "Size=" + size + '}';
    }
}
