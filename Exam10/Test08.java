package Exam10;

import java.util.Random;
import java.util.Scanner;

public class Test08 {
    static Scanner stdIn = new Scanner(System.in);

    // confirmRetry: 사용자가 재시작할지 여부를 확인하는 메소드
    static boolean confirmRetry() {
        int cont;
        do {
            System.out.println("다시한번 < 1 - o / 2 - x >");
            cont = stdIn.nextInt();
        } while (cont != 1 && cont != 2); // 1 또는 2만 허용
        return cont == 1; // 1이면 true, 2이면 false 반환
    }

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("암산을 하자 ! ");

        do {
            // 랜덤으로 세 숫자 생성 (100~999)
            int x = rand.nextInt(900) + 100;
            int y = rand.nextInt(900) + 100;
            int z = rand.nextInt(900) + 100;
            // 0 ~ 3 사이의 랜덤 값 (패턴 결정)
            int patten = rand.nextInt(4);

            int answer;
            // 문제 유형에 따라 정답을 결정
            switch (patten) {
                case 0:
                    answer = x + y + z; // 덧셈 문제
                    break;
                case 1:
                    answer = x + y - z; // 덧셈과 뺄셈 혼합 문제
                    break;
                case 2:
                    answer = x - y + z; // 뺄셈과 덧셈 혼합 문제
                    break;
                default:
                    answer = x - y - z; // 뺄셈 문제
                    break;
            }

            // 문제를 푸는 부분
            while (true) {
                // 패턴에 맞는 연산자를 출력하는 부분
                String operator1 = (patten < 2) ? "+" : "-";
                String operator2 = (patten % 2 == 0) ? "+" : "-";
                System.out.println(x + operator1 + y + operator2 + z + "=");

                // 사용자가 입력한 값 받기
                int k = stdIn.nextInt();

                // 정답 확인
                if (k == answer)
                    break; // 정답 맞히면 반복문 종료
                System.out.println("틀렸습니다"); // 틀렸을 경우
            }
        } while (confirmRetry()); // 사용자가 1을 입력하면 퀴즈를 다시 시작
    }
}
