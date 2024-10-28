package Test03;

import java.util.Scanner;

class Coordinate3Test {
    public static void main(String[]args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌표는 몇 개");
        int n = stdIn.nextInt();

        Coordinate[]a = new Coordinate[n];

        for (int i =0; i<a.length; i++)
            a[i].set(5.5,7.7);


        for (int i =0; i<a.length; i++)
            System.out.printf("a[%d]=(%.1%,%.1%)\n",i,a[i].getX(),a[i].gety());
    }
}
