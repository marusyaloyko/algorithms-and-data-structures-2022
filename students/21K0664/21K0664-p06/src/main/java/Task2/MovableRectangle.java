package Task2;

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    MovableRectangle(){}
    public void check(int xSpeed, int ySpeed){
        if (xSpeed == ySpeed){
            System.out.print("Error!\nXspeed != Yspeed");
            System.exit(0);
        }
    }
    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(topLeft.x, topLeft.y, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(bottomRight.x, bottomRight.y, xSpeed, ySpeed);
    }
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }


    public String toString() {
        return "Rectangle: \n" +
                "topLeft " + topLeft +
                ", bottomRight " + bottomRight;
    }
}
