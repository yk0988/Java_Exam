package Exam10;

import java.util.Scanner;

public class Test05 {
    static void putChars(char c, int n) {
    while (n-- > 0) //while 루프는 n이 0보다 큰 동안 c를 출력
        System.out.print(c);  // println->print
    System.out.println();      // 별 출력 후에 줄 바꿈
}

    static void putStars(int n) {
        putChars('*', n);//n을 받아, putChars 메소드를 호출하여 n개의 '*' 문자를 출력
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는 : ");
        int n = stdIn.nextInt();
        for (int i = 1; i <= n; i++) {
            putStars(i);
        }
    }
}

