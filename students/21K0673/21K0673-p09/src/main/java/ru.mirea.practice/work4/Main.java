package ru.mirea.practice.work4;

public class Main implements Comparable {

    int number;

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    Main(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Main[] mains = new Main[]{
                new Main(8),
                new Main(4),
                new Main(1),
                new Main(3),
                new Main(3)};
        Main main = new Main(0);
        main.compareTo(mains);

        for (int i = 0; i < 5; i++) {
            System.out.println(mains[i].getNumber());
        }
    }

    @Override
    public void compareTo(Main[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].getNumber() > array[i].getNumber()) {
                    int buff = array[i].getNumber();
                    array[i].setNumber(array[j].getNumber());
                    array[j].setNumber(buff);
                }
            }
        }
    }
}
