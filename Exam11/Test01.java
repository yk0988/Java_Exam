package Exam11;

import java.util.Scanner;

public class Test01 {

    // 정수 x의 31비트부터 0비트까지 출력
    static void printBits(int x) {
        for (int i = 31; i >= 0; i--) {
            System.out.print(((x >>> i) & 1) == 1 ? '1' : '0'); // '1' 또는 '0' 출력
        }
        System.out.println();
    }

    // pos 비트 1로 설정
    static int set(int x, int pos) {
        return x | (1 << pos); // pos 위치에 1을 설정
    }

    // pos 비트 0으로 설정
    static int reset(int x, int pos) {
        return x & ~(1 << pos); // pos 위치에 0을 설정
    }

    // pos 비트 반전
    static int inverse(int x, int pos) {
        return x ^ (1 << pos); // pos 위치의 비트를 반전
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 x의 pos번째 비트를 변경합니다.");
        System.out.print("x : ");
        int x = stdIn.nextInt(); // x 값 입력받기
        System.out.print("pos : ");
        int pos = stdIn.nextInt(); // pos 값 입력받기

        System.out.print("x               = "); printBits(x); // x의 비트 출력
        System.out.print("set(x,pos)      = "); printBits(set(x, pos)); // set 결과 출력
        System.out.print("reset(x,pos)    = "); printBits(reset(x, pos)); // reset 결과 출력
        System.out.print("inverse(x,pos)  = "); printBits(inverse(x, pos)); // inverse 결과 출력
        stdIn.close();
    }
}
