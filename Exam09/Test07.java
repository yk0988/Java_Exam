package Exam09;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("불규칙한 2차원 배열을 생성합니다.");
        System.out.print("행 수 : ");
        int height = stdIn.nextInt();

        int[][] c = new int[height][]; // 불규칙 2차원 배열 생성

        // 각 행에 대한 열의 크기 입력받기
        for (int i = 0; i < c.length; i++) {
            System.out.print(i + "행 째의 열 수: ");
            int width = stdIn.nextInt();
            c[i] = new int[width]; // 각 행에 맞는 열 수 할당
        }

        System.out.println("각 요소의 값을 입력하세요.");
        // 각 요소에 값 입력
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {  // 조건을 j < c[i].length로 수정
                System.out.printf("c[%d][%d]: ", i, j);
                c[i][j] = stdIn.nextInt();  // 요소 값 입력
            }
        }

        // 배열의 내용을 출력
        System.out.println("배열의 값:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {  // 조건을 j < c[i].length로 수정
                System.out.printf("%3d", c[i][j]);  // 배열 요소 출력
            }
            System.out.println();  // 한 행 출력 후 줄 바꿈
        }
    }
}
