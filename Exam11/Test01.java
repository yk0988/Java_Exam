package Exam11;

import java.util.Scanner;

public class Test01 {
    static void printBits(int x) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(((x >>> i) & 1) == 1 ? '1' : '0');
        }
        System.out.println();
    }

    static int set(int x, int pos) {
        return x | (1 << pos);
    }

    static int reset(int x, int pos) {
        return x & ~(1 << pos);
    }

    static int inverse(int x, int pos) {
        return x ^ (1 << pos);
    }


    //메서드 printBits(int x)
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 x의 pos번째 비트를 변경합니다.");
        System.out.print("x : "); int x = stdIn.nextInt();
        System.out.print("pos : "); int pos = stdIn.nextInt();

        System.out.print("x               = "); printBits(x);
        System.out.print("set(x,pos)      = "); printBits(set(x, pos));
        System.out.print("reset(x,pos)    = "); printBits(reset(x, pos));
        System.out.print("inverse(x,pos)  = "); printBits(inverse(x, pos));
        stdIn.close();
    }
}
