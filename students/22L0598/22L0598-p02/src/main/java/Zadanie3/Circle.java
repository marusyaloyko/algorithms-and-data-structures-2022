package Zadanie3;

public class Circle {

        private Point t;
        private double r;

    public Circle(Point t, double r) {
        this.t = t;
        this.r = r;
    }

        public double getR() {
        return this.r;
    }

        public Point getT() {
        return this.t;
    }

        public void setT(Point t) {
        this.t = t;
    }

        public void setR(double r) {
        this.r = r;
    }

        public String toString() {
        return "центр: "+t+"\nрадиус: "+r;
    }

}
