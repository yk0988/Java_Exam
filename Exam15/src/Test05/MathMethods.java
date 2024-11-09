package Test05;

import java.util.Scanner;

class MathMethods {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.print("실수값: ");
        double x = stdin.nextDouble();

        System.out.println("절댓값: " + Math.abs(x));
        System.out.println("제곱근: " + Math.sqrt(x));
        System.out.println("원 면적: " + Math.PI * x * x);
    }
}