import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        // 배열의 요소 수와 개별 요소의 값을 입력받아 표시하는 프로그램
        // 배열 초기값 형식으로 표시, 쉼표로 연결하고 {}로 감싸기
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수: ");
        int n = stdIn.nextInt(); // 요소 수 입력
        int[] a = new int[n];    // 배열 선언

        // 배열 요소 값 입력
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        // 배열 출력 형식: a = {값1, 값2, ..., 값n}
        System.out.print("a = {");
        if (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                System.out.print(a[i] + ", ");
            }
            System.out.print(a[n - 1]); // 마지막 요소는 쉼표 없이 출력
        }
        System.out.println("}");  // 배열 닫기
    }
}
