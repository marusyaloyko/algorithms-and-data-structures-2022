package Task2;

class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    MovablePoint(){}
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp() {
        y+=ySpeed;
    }
    public void moveDown() {
        y-=ySpeed;
    }
    public void moveRight() {
        x+=xSpeed;
    }
    public void moveLeft() {
        x-=xSpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public String toString() {
        return "Point(" + x +
                ", " + y +
                ')';
    }
}
