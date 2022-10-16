package ru.mirea.practice.work10;

public class Memory extends Computer {
    double capacity;

    public Memory(EnumComputer company_name, double cost, double capacity) {
        this.companyName = company_name;
        this.cost = cost;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Memory:{Capacity= " + capacity + '}';
    }
}
