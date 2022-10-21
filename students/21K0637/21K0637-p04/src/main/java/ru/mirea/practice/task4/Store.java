package ru.mirea.practice.task4;

public class Store {
    public static void main(String[] args) {
        Memory SSD512 = new Memory(512, Type.SSD);
        Memory SSD1024 = new Memory(1024, Type.SSD_M2);
        Memory HDD2046 = new Memory(2046, Type.HDD);

        Monitor FullHD144 = new Monitor("1920x1080", 90);
        Monitor _2K144 = new Monitor("2048x1080", 144);
        Monitor FullHD60 = new Monitor("2048x1080", 60);

        Processor Intell9i5 = new Processor(9, "9300H", 2400);
        Processor Intell11i9 = new Processor(11, "11900H", 4900);
        Processor Intell12i7 = new Processor(12, "1255UL", 4700);


        Computer[] computers = {
                new Computer(Computer.Type.Home, Computer.Brand.Acer, HDD2046, Intell9i5, FullHD144),
                new Computer(Computer.Type.Gaming, Computer.Brand.MSI, SSD512, Intell11i9, FullHD60),
                new Computer(Computer.Type.Office, Computer.Brand.DELL, SSD512, Intell9i5, FullHD60),
                new Computer(Computer.Type.Gaming, Computer.Brand.Lenovo, SSD1024, Intell12i7, _2K144)
        };

        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
