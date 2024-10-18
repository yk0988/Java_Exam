import java.util.Random;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        // int 배열 요소 - 1~10 난수 입력 후 각 요소 값을 막대그래프로 표시
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수: ");
        int n = stdIn.nextInt(); // 요소 수 읽기
        int[] a = new int[n];    // 배열 생성

        // 배열에 1~10 사이의 난수를 저장
        for (int i = 0; i < n; i++) {
            a[i] = 1 + rand.nextInt(10);
        }

        // 막대 그래프 출력 (위에서 아래로)
        for (int i = 10; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                if (a[j] >= i)
                    System.out.print("* ");  // 같은 줄에 출력
                else
                    System.out.print("  ");  // 공백 출력
            }
            System.out.println();  // 한 줄이 끝나면 줄 바꿈
        }

        // 바닥선 출력
        for (int i = 0; i < n; i++)
            System.out.print("--");
        System.out.println();

        // 인덱스 번호 출력 (0~9 순환)
        for (int i = 0; i < n; i++)
            System.out.print((i % 10) + " ");
        System.out.println();
    }
}
