package task8;

public class Square extends Rectangle{
    private double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Квадрат: цвет - " + this.getColor()
                + ", закрашен - " + this.isFilled()
                + ", сторона - " + this.side;
    }
}
