package task7;

public class Converter {
    double RUB;

    public Converter(double RUB) {
        this.RUB = RUB;
    }

    public double getRUB() {
        return RUB;
    }

    public void setRUB(double RUB) {
        this.RUB = RUB;
    }

    public double EUR(){
        return this.RUB/62.6;
    }
    public double USD(){
        return this.RUB/63.5;
    }
    public double CNY(){
        return this.RUB/8.7;
    }
}
