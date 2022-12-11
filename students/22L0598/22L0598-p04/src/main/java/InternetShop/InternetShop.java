package InternetShop;

import java.util.Scanner;

public class InternetShop {
    public static class Product {
        String nameProduct;
        double cost, rating;

        Product(String nameProduct, double cost, double rating) {
            this.nameProduct = nameProduct;
            this.cost = cost;
            this.rating = rating;
        }
    }

    public static class Category {
        String nameCategory;
        Product[] products;

        Category(String nameCategory, Product[] products) {
            this.nameCategory = nameCategory;
            this.products = products;
        }
    }

    public static class Basket {
        Product[] purchased;

        Basket(Product[] purchased) {
            this.purchased = purchased;
        }
    }

    public static class User {
        public User(String login, String password) {
            this.login = login;
            this.password = password;
        }
        public String login, password;
        public Basket purchased;

        boolean isAuth(String login, String password) {
            if(this.login == login && this.password == password) return true;
            else return false;
        }
    }

    public static void getMenu() {
        System.out.println("\n menu");
        System.out.println("1.Product categories");
        System.out.println("2.Basket");
        System.out.println("3.To pay");
        System.out.println("0.Exit");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number) {
            case 1: {
                getCategory(all);
                break;
            }
            case 2: {
                getBasket(card);
                break;
            }
            case 3: {
                Buy();
                break;
            }
            case 0: {
                break;
            }
        }
    }
    public static void Buy() {
        Basket cards = new Basket(card);
        client.purchased = cards;
        System.out.println("Product receipt");
        for(int i = 0; i < client.purchased.purchased.length; ++i) {
            if(client.purchased.purchased[i] == null) break;
            System.out.println((i+1) + ". " + client.purchased.purchased[i].nameProduct + " ------- "
                    + client.purchased.purchased[i].cost + " ------- " + client.purchased.purchased[i].rating);
        }
        double gc = getCash(client.purchased.purchased);
        System.out.print("Total amount -------" + gc);

    }
    public static double getCash(Product[] p) {
        double cash = 0.0;
        for(int i = 0; i < p.length; ++i) {
            if(p[i] == null) break;
            cash+=p[i].cost;
        }
        return cash;
    }
    public static void getCategory(Category[] c) {
        for(int i = 0; i < c.length; ++i)System.out.println("№"+ (i+1) + " " + c[i].nameCategory);
        System.out.println("0.To back");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
        else seeProduct(all[number-1]);

    }
    public static void getBasket(Product[] b) {
        for(int i = 0; i < b.length; ++i) {
            if(b[i] == null) break;
            System.out.println((i+1) + ". " + b[i].nameProduct + " ------- "
                    + b[i].cost + " ------- " + b[i].rating);
        }
        System.out.println("0.To back");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getMenu();
    }

    public static void seeProduct(Category cat) {
        for(int i = 0; i < cat.products.length; ++i) {
            System.out.println((i+1) + ". " + cat.products[i].nameProduct + " ------- "
                    + cat.products[i].cost + " ------- " + cat.products[i].rating);
        }
        System.out.println("0.To back");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number == 0)getCategory(all);
        else buyProduct(cat.products[number-1]);
    }

    private static void buyProduct(Product p) {
        System.out.println("Product " + p.nameProduct + " for " + p.cost + " has been added to your basket");
        for(int i = 0; i < card.length; ++i) {
            if(card[i] == null) {
                card[i] = p;
                break;
            }
            else {
                if(i+1 == card.length && card[i] == null) {
                    System.out.println("The basket is full");
                    break;
                }
            }
        }

        getCategory(all);
    }

    static Product bread = new Product("Bread", 34.0, 4.3);
    static Product buscuit = new Product("Biscuit", 60.0, 5.0);
    static Product cookies = new Product("Cookies", 75.0, 4.9);

    static Product milk = new Product("Milk", 123.0, 4.3);
    static Product kefir = new Product("Eggs", 86.0, 4.2);
    static Product curd = new Product("Сurd", 75.0, 5.0);

    static Product[] Bakery = { bread, buscuit, cookies };
    static Product[] Diary = { milk, kefir, curd };

    static Category bakery = new Category("Bakery products", Bakery);
    static Category diary = new Category("Dairy products", Diary);

    static Category[] all = { bakery, diary };
    static Product[] card;
    static User client;
    public static void main(String[] args) {
        client = new User ("123","123");

        Scanner scanner = new Scanner(System.in);
        card = new Product[10];
        System.out.println("Authorization \n Enter the username and password of the user:");
        String login = (String)scanner.nextLine();
        String password = (String)scanner.nextLine();
        if (!client.isAuth(login, password)) {
            getMenu();
        }

    }

}

