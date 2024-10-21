package Exam10;

import java.util.Scanner;

public class Test07 {
    static Scanner stdIn = new Scanner(System.in);

    static int readPlusInt() {
        int x;
        do {
            System.out.print("양의 정수값 : ");
            x = stdIn.nextInt();
        } while (x <= 0);
        return x;
    }

    public static void main(String[] args) {
        int x;
        do {
            int n = readPlusInt();

            System.out.print("반대로 읽으면 ");
            while (n > 0) {
                System.out.print(n % 10); // 마지막 자리수를 출력
                n /= 10; // 10으로 나누어 자릿수를 줄임
            }
            System.out.println("입니다.");

            do {
                System.out.print("다시한번? < 1 .. yes  2 ... no > ");
                x = stdIn.nextInt();
            } while (x != 1 && x != 2);
        } while (x == 1);
    }
}

