package Exam09;

import java.util.Scanner;
public class Test10 {
    static int min(int a, int b, int c) {
        int min = a;  // 먼저 a를 최소값으로 설정
        if (b < min) min = b;  // b가 min보다 작으면 min을 b로 갱신
        if (c < min) min = c;  // c가 min보다 작으면 min을 c로 갱신
        return min;  // 가장 작은 값을 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수 a:"); int a = stdIn.nextInt();
        System.out.println("정수 b:"); int b = stdIn.nextInt();
        System.out.println("정수 c:"); int c = stdIn.nextInt();
        System.out.println("최소값  : "+ min(a,b,c) + " 입니다.");

    }
}
