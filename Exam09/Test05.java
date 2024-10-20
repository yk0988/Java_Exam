package Exam09;
import java.util.Scanner;
public class Test05 {
        public static void main(String[] args) {
            Scanner stdIn = new Scanner(System.in);  // Scanner 객체 선언
            int[][] a = new int[4][3];  // 4x3 행렬
            int[][] b = new int[3][4];  // 3x4 행렬
            int[][] c = new int[4][4];  // 4x4 행렬 (결과 저장)

            System.out.println("행렬 a의 요소를 입력:");
            for (int i = 0; i < 4; i++) {  // 행
                for (int j = 0; j < 3; j++) {  // 열 3까지 반복
                    System.out.printf("a[%d][%d]: ", i, j);  // 배열 요소 입력 안내
                    a[i][j] = stdIn.nextInt();  // 사용자 입력 값 저장
                }
            }

            System.out.println("행렬 b의 요소를 입력:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {  // 열 4까지 반복
                    System.out.printf("b[%d][%d]: ", i, j);  // 배열 요소 입력 안내
                    b[i][j] = stdIn.nextInt();  // 사용자 입력 값 저장
                }
            }

            // 행렬 곱셈
            for (int i = 0; i < 4; i++) {  // c의 행 반복
                for (int j = 0; j < 4; j++) {  // c의 열 반복
                    c[i][j] = 0;  // 초기화
                    for (int k = 0; k < 3; k++) {  // a의 열과 b의 행 곱셈
                        c[i][j] += a[i][k] * b[k][j];  // 행렬 곱셈 공식
                    }
                }
            }

            // 행렬 곱셈 결과 출력
            System.out.println("행렬 a x b 곱:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(c[i][j] + " ");  // c 행렬 출력
                }
                System.out.println();
            }
        }
    }