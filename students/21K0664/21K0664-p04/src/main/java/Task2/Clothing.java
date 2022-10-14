package Task2;

class Clothing implements MenClothing, WomenClothing {
    protected clothSize clothSizes;
    protected int price;
    protected String color;
    Clothing(){}
    public Clothing(clothSize clothSizes, int price, String color){
        this.clothSizes = clothSizes;
        this.price = price;
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public clothSize getClothSize() {
        return clothSizes;
    }

    public int getPrice() {
        return price;
    }

    public void setClothSize(clothSize clothSizes) {
        this.clothSizes = clothSizes;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public String toString() {
        return "Task2.Clothing{" +
                "Task2.clothSize = " + clothSizes + ", eurosize = " + clothSizes.euroSize() +
                ", price = " + price +
                ", color = '" + color + '\'' +
                '}';
    }
    public void dressMan() {
    }
    public void dressWoman() {
    }
}
