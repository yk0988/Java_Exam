package Exam09;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("학급 수 :");
        int classNum = stdIn.nextInt();
        int[][] point = new int[classNum][]; // 반 수에 맞는 2차원 배열 생성
        int totNumber = 0; // 전체 학생 수

        // 각 반의 학생 수와 점수 입력
        for (int i = 0; i < point.length; i++) {
            System.out.printf("%d반 학생 수: ", i + 1);
            int num = stdIn.nextInt();
            point[i] = new int[num]; // 반마다 학생 수에 맞는 배열 생성
            totNumber += num; // 전체 학생 수 누적

            // 각 학생의 점수 입력
            for (int j = 0; j < point[i].length; j++) {
                System.out.printf("%d반 %d번의 점수: ", i + 1, j + 1);
                point[i][j] = stdIn.nextInt();
            }
        }

        // 결과 출력
        System.out.println(" 반 | 합계 평균");
        System.out.println("-----------------");
        int total = 0; // 전체 합계

        // 각 반별 합계 및 평균 계산
        for (int i = 0; i < point.length; i++) {
            int sum = 0; // 각 반의 합계
            for (int j = 0; j < point[i].length; j++) {
                sum += point[i][j]; // 각 학생의 점수를 합산
            }
            total += sum; // 전체 합계에 더하기

            // 각 반의 합계 및 평균 출력
            System.out.printf("%2d반 |%7d%7.1f\n", i + 1, sum, (double) sum / point[i].length);
        }

        System.out.println("------------------");

        // 전체 합계 및 평균 출력
        System.out.printf("   합 |%7d%7.1f\n", total, (double) total / totNumber);
    }
}
