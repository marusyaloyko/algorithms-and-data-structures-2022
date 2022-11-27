package ru.mirea.practice.n4;

import java.util.Objects;

public class Computer {
    private String cpu = "";
    private String motherboard = "";
    private String gpu = "";
    private String ram = "";

    public Computer(String cpu, String motherboard, String gpu, String ram) {
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.gpu = gpu;
        this.ram = ram;
    }

    public Computer() {
    }

    public String getcpu() {
        return cpu;
    }

    public void setcpu(String cpu) {
        this.cpu = cpu;
    }

    public String getmotherboard() {
        return motherboard;
    }

    public void setmotherboard(String motherboard) {
        motherboard = motherboard;
    }

    public String getgpu() {
        return gpu;
    }

    public void setgpu(String gpu) {
        this.gpu = gpu;
    }

    public String getram() {
        return ram;
    }

    public void setram(String ram) {
        this.ram = ram;
    }


    @Override
    public String toString() {
        return "Computer{"
                +
                "cpu='" + cpu + '\''
                +
                ", motherboard='" + motherboard + '\''
                +
                ", gpu='" + gpu + '\''
                +
                ", ram='" + ram + '\''
                +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Computer computer = (Computer) o;
        if (Objects.equals(cpu, computer.cpu) && Objects.equals(motherboard, computer.motherboard)) {
            if (Objects.equals(gpu, computer.gpu) && Objects.equals(ram, computer.ram)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, motherboard, gpu, ram);
    }
}
