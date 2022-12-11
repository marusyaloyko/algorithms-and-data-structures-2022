package ru.mirea.practice.Seasons;

public enum Seasons {
    WINTER(-14), SPRING(55), SUMMER(28){
        @Override
        public String getDescription() {
            return "warm season";
        }
    },
    AUTUMN(10);

    private double avgTmp;

    Seasons(double avgTmp){
        this.avgTmp = avgTmp;
    }

    public double getAvgTmp() {
        return avgTmp;
    }

    public String getDescription() {
        return "cold season";

    }

}