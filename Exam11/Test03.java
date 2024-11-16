package Exam11;

import java.util.Scanner;

public class Test03 {

    // 배열 a의 모든 요소의 합을 구하는 메서드
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i]; // 배열 요소를 더함
        }
        return sum; // 합 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 배열의 요소 수 입력받음
        System.out.println("요소 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num]; // 입력받은 수만큼 배열 생성

        // 배열 각 요소에 값 입력받음
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = stdIn.nextInt(); // 배열에 값 입력
        }

        // 배열의 모든 요소 합 출력
        System.out.println("모든 요소의 합은" + sumOf(x) + "입니다.");
    }
}
