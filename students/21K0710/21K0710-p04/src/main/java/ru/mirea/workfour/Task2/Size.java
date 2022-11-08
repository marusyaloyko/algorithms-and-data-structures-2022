package ru.mirea.workfour.Task2;

public enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);
    public String getDescription(){
        if (this == XXS){
            return "Детский размер";
        }
        return "Взрослый размер";
    }
    private final int euroSize;
    private Size(int euroSize){
        this.euroSize = euroSize;
    }
    public int getEuroSize(){
        return this.euroSize;
    }
}
