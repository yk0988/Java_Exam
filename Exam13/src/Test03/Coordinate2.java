package Test03;

import java.util.Scanner;

public class Coordinate2 {
    static boolean compCoordinate(Coordinate c1,Coordinate c2){
        return c1.getX()== c1.getX() && c1.gety() == c1.gety();
    }
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);

        double x,y;
        System.out.println("좌표 p를 입력하세요");
        System.out.println("x좌표");  x = stdIn.nextDouble();
        System.out.println("y좌표");  y= stdIn.nextDouble();
        Coordinate p = new Coordinate(x,y);

        System.out.println("좌표 p를 입력하세요");
        System.out.println("x좌표");  x = stdIn.nextDouble();
        System.out.println("y좌표");  y= stdIn.nextDouble();
        Coordinate q = new Coordinate(x,y);

    }
}
