package Test06;

import java.util.Scanner;

public class MinMaxTester {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // x, y, z 값 입력
        System.out.print("x값: ");
        int x = stdin.nextInt();
        System.out.print("y값: ");
        int y = stdin.nextInt();
        System.out.print("z값: ");
        int z = stdin.nextInt();

        // 배열의 요소 수 입력
        System.out.print("배열의 요소 수: ");
        int num = stdin.nextInt();

        // 입력받은 요소 수(num)만큼의 배열 a 생성
        int[] a = new int[num]; // 요소 수가 num인 배열

        // 배열 a의 각 요소에 대해 값 입력 받기
        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "]: "); // 배열 인덱스를 출력
            a[i] = stdin.nextInt(); // 배열에 입력받은 값 저장
        }

        // x, y의 최솟값과 최댓값 출력
        System.out.printf("x, y의 최솟값은 %d입니다.\n", MinMax.min(x, y));
        System.out.printf("x, y의 최댓값은 %d입니다.\n", MinMax.max(x, y));

        // x, y, z의 최솟값과 최댓값 출력
        System.out.printf("x, y, z의 최솟값은 %d입니다.\n", MinMax.min(x, y, z));
        System.out.printf("x, y, z의 최댓값은 %d입니다.\n", MinMax.max(x, y, z));

        // 배열 a의 최솟값 출력
        System.out.printf("배열 a의 최솟값은 %d입니다.\n", MinMax.min(a));

        // 배열 a에서 최솟값의 인덱스 출력
        int xmin[] = MinMax.minIndexArray(a);
        System.out.print("인덱스 {");
        for (int i = 0; i < xmin.length; i++) {
            System.out.print(xmin[i] + " "); // 각 최솟값 인덱스를 출력
        }
        System.out.println("}입니다.");

        // 배열 a의 최댓값 출력
        System.out.printf("배열 a의 최댓값은 %d입니다.\n", MinMax.max(a));

        // 배열 a에서 최댓값의 인덱스 출력
        int xmax[] = MinMax.maxIndexArray(a);
        System.out.print("인덱스 {");
        for (int i = 0; i < xmax.length; i++) {
            System.out.print(xmax[i] + " "); // 각 최댓값 인덱스를 출력
        }
        System.out.println("}입니다.");
    }
}
