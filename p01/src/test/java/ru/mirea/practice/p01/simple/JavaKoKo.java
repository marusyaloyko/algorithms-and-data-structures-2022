


package ru.mirea.practice.p01.simple;

import java.io.Serializable;

public final class JavaKoKo {
    private final KoKo1 koko = new KoKo1();
    int point = 0;

    class KoKo1 {
        void call() {
            JavaKoKo.this.point = 1;
        }
    }

    static class KoKo2 {
        static class KoKo3 {

        }
    }

    void call() {
        koko.call();
    }

    enum Type implements Serializable {
        ONE("Кол"), TWO("Двойка"), THREE("Тройка"), FOUR("Четверка"),
        FIVE("Пятерка"), NOT_PRESENT("Не присутствовал");

        public final String name;

        Type(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        JavaKoKo k = new JavaKoKo();
        k.call();
        System.out.println("Point: " + k.point);
        System.out.println("Type : " + Type.ONE.name);
    }
}
