package Shop;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите поступившее количество компьютеров:");
        int N;
        shop.setN(sc.nextInt());
        // Добавление компьютеров в магазин
        for (int i = 0; i < shop.getN(); i++) {
            System.out.println("Введите характеристики компьютера(класс видеокарты, частота процессора(ГГц), количество оперативной памяти(Гб), объем жесткого диска(Гб)):");
            shop.addComputer(sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
        }
        // Удаление компьютера
        System.out.println("Введите параметры удаляемого компьютера:");
        shop.deleteComputer(sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
        // Если удалили освобождается слот под новый ПК, можно его добавить
        shop.addComputer(sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
        // Поиск компьютера
        System.out.println("Введите параметры искомого компьютера:");
        shop.search(sc.nextInt(), sc.nextDouble(), sc.nextInt(), sc.nextInt());
        // Вывод всех компьютеров
        shop.allComputers();
    }
}
