package Test04;

class Coordinate {
    private double x = 0.0;
    private double y = 0.0;

    public Coordinate() {
    }

    public Coordinate(double x, double b) {
        set(x, y);
    }

    public Coordinate(Coordinate p) {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equalTo(Coordinate c) {
        return x == c.x && y == c.y;
    }


    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}