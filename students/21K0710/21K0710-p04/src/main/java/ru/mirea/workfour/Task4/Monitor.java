package ru.mirea.workfour.Task4;

public class Monitor {
    private int refresh_rate;
    private String resolution;
    private double diagonal;
    private String name;

    public Monitor(int refresh_rate, String resolution, double diagonal, String name) {
        this.refresh_rate = refresh_rate;
        this.resolution = resolution;
        this.diagonal = diagonal;
        this.name = name;
    }

    public int getRefresh_rate() {
        return refresh_rate;
    }

    public void setRefresh_rate(int refresh_rate) {
        this.refresh_rate = refresh_rate;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "refresh_rate=" + refresh_rate +
                ", resolution='" + resolution + '\'' +
                ", diagonal=" + diagonal +
                ", name='" + name + '\'' +
                '}';
    }
}
