package Exam10;

import java.util.Scanner;

public class Test10 {
    static int pow2(int no){

        int pw = 1;
        while (no--> 0)
            pw *= 2;
        return  pw;
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 x를 n비트 시프트 합니다.");
        System.out.print("x:"); int x = stdIn.nextInt();
        System.out.print("n:"); int n = stdIn.nextInt();

    }
}
