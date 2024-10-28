package Test03;

public class Coordinate {
    private double x;
    private double y;

    Coordinate(double x,double y){this.x=x; this.y=y; }

    double getX(){return x;}
    double gety(){return y;}

    void setx(double x){this.x=x;}
    void sety(double y){this.y=y;}

    void set(double x,double y){this.x=x; this.y=y;}

}
