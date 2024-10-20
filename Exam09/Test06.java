package Exam09;

import java.util.Scanner;
public class Test06 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        final int number = 6;
        int[][] point = new int[number][2];  // 학생 수(number)만큼 국어, 수학 점수를 위한 배열 초기화
        int[] sumStuent = new int[number];   // 각 학생의 총점 배열
        int[] sumSubject = new int[2];       // 국어와 수학 각각의 총합을 저장하는 배열

        System.out.println(number + "명의 국어, 수학 점수를 입력하세요.");

        // 점수 입력 및 합계 계산
        for (int i = 0; i < number; i++) {
            System.out.print("학생 " + (i + 1) + " - 국어: ");
            point[i][0] = stdIn.nextInt();  // 국어 점수 입력

            System.out.print("    수학: ");
            point[i][1] = stdIn.nextInt();  // 수학 점수 입력

            sumStuent[i] = point[i][0] + point[i][1];  // 학생의 총점 계산
            sumSubject[0] += point[i][0];  // 국어 점수 총합
            sumSubject[1] += point[i][1];  // 수학 점수 총합
        }

        // 결과 출력
        System.out.println("No. 국어  수학  평균");
        for (int i = 0; i < number; i++) {
            System.out.printf("%2d %6d %6d %6.1f\n", i + 1, point[i][0], point[i][1], (double) sumStuent[i] / 2);
        }

        // 과목별 평균 출력
        System.out.printf("평균 %6.1f %6.1f\n", (double) sumSubject[0] / number, (double) sumSubject[1] / number);
    }
}
