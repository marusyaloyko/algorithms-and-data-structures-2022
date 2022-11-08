package ru.mirea.worktwo.Shop;

public class Shop {
    Computer[] arrComputer;
    Computer comp;
    int N;
    int cur = 0;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
        arrComputer = new Computer[N];
    }

    public void setComputer(int vcardClass, double frequency, int RAM, int HDD) {
        this.comp = new Computer(vcardClass, frequency, RAM, HDD);
    }

    public void addComputer(int vcardClass, double frequency, int RAM, int HDD) {
        this.comp = new Computer(vcardClass, frequency, RAM, HDD);
        if (cur < N) {
            arrComputer[cur] = comp;
            cur += 1;
        } else {
            System.out.println("Вы добавили максимальное количество компьютеров.");
        }
    }

    public void deleteComputer(int vcardClass, double frequency, int RAM, int HDD) {
        this.comp = new Computer(vcardClass, frequency, RAM, HDD);
        int f = 0;
        for (int i = 0; i < cur; i++) {
            if (comp.equals(arrComputer[i])) {
                for (int g = 0; g < N - 1; g++) {
                    if (arrComputer[g].equals(arrComputer[i])) {
                        Computer temp;
                        temp = arrComputer[g + 1];
                        arrComputer[g + 1] = arrComputer[g];
                        arrComputer[g] = temp;
                    }
                }
                cur -= 1;
                System.out.println("Компьютер №" + (i + 1) + "удален");
                break;
            }
            f = i;
        }
        if (f == N - 1) {
            System.out.println("Компьютер не найден");
        }
    }

    public void search(int vcardClass, double frequency, int RAM, int HDD) {
        this.comp = new Computer(vcardClass, frequency, RAM, HDD);
        int f = 0;
        for (int i = 0; i < N; i++) {
            if (comp.equals(arrComputer[i])) {
                System.out.println("Искомый компьютер №" + (i + 1));
                break;
            }
            f = i;
        }
        if (f == N - 1) {
            System.out.println("Компьютер не найден");
        }
    }

    public void allComputers() {
        for (int i = 0; i < N; i++) {
            System.out.println("№" + (i + 1) + ":" + arrComputer[i]);
        }
    }
}
