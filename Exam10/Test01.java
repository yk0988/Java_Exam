package Exam10;

import java.util.Scanner;

public class Test01 {
    // 합을 구하는 static 메소드
    static int sumUp(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // Scanner 객체 생성

        System.out.println("1부터 x까지의 합을 구하자.");
        int x;

    }

}

