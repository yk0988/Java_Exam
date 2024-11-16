package Exam11;

import java.util.Scanner;

public class Test04 {

    // 배열 a에서 가장 작은 값을 찾는 메서드
    static int minOf(int[] a) {
        int min = a[0]; // 첫 번째 요소를 최소값으로 설정
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i]; // 더 작은 값 발견 시 최소값
            }
        }
        return min; // 최소값 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 사람 수 입력받기
        System.out.println("사람 수는 :");
        int num = stdIn.nextInt();

        int[] height = new int[num]; // 신장 배열
        int[] weight = new int[num]; // 체중 배열

        // 신장과 체중 입력 받기
        System.out.println(num + "명의 신장과 체중을 입력하자.");
        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "번의 신장");
            height[i] = stdIn.nextInt(); // 신장 입력
            System.out.println((i + 1) + "번의 체중");
            weight[i] = stdIn.nextInt(); // 체중 입력
        }

        // 가장 작은 신장과 체중 출력
        System.out.println("가장 키가 작은 사람의 신장: " + minOf(height) + "cm");
        System.out.println("가장 마른 사람의 체중: " + minOf(weight) + "kg");
    }
}
