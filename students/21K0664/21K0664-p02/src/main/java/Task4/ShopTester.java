package Task4;

import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args) {
        Shop Sh=new Shop(8);

        System.out.println(Sh.toString());

        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.print("Введите номер компьютера (1-10): ");
        a = sc.nextInt();

        System.out.println();
        Sh.findComputer(a);
        Sh.addComputer(4);
        Sh.delComputer(5);
        Sh.findComputer(10);
    }
}