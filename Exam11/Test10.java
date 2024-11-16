package Exam11;

import java.util.Scanner;

public class Test10 {

    // 배열 a를 복사하여 새로운 배열을 반환하는 메서드
    static int[] arrayClone(int[] a) {
        int[] c = new int[a.length]; // 배열 c는 a와 동일한 크기로 생성
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i]; // 배열 a의 각 요소를 배열 c로 복사
        }
        return c; // 복사된 배열 c 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 배열 크기 입력 받기
        System.out.println("요소 수");
        int num = stdIn.nextInt();

        int[] x = new int[num]; // 크기가 num인 배열 x 생성

        // 배열 x에 값 입력 받기
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = stdIn.nextInt(); // 배열 x의 각 요소 입력
        }

        // 배열 x를 복사하여 배열 y 생성
        int[] y = arrayClone(x);

        // 배열 y의 값 출력
        System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
        for (int i = 0; i < num; i++) {
            System.out.println("y[" + i + "]=" + y[i]); // 배열 y의 각 요소 출력
        }
    }
}
