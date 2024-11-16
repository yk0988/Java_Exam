package test04;

import java.util.Scanner;

public class Test04 {

    // 배열 a에서 idx 위치에 값 x를 삽입하는 함수
    static int[] arrayInsOf(int[] a, int idx, int x) {
        // 유효하지 않은 인덱스일 경우 (배열의 범위를 벗어난 경우) 기존 배열을 반환
        if (idx < 0 || idx > a.length)
            return a.clone();  // 원본 배열을 복사해서 반환

        else {
            // 새로운 배열을 만들어 기존 배열보다 하나 더 큰 크기로 할당
            int[] c = new int[a.length + 1];

            int i = 0;
            // idx 위치까지 기존 배열의 값을 새로운 배열 c에 복사
            for (; i < idx; i++)
                c[i] = a[i];

            // 기존 배열의 값들을 idx 위치부터 새 배열에 복사 (한 칸씩 뒤로 밀기)
            for (; i < a.length; i++)
                c[i + 1] = a[i];

            // 새 배열의 idx 위치에 삽입할 값 x를 넣음
            c[idx] = x;

            return c;  // 새로운 배열 반환
        }
    }

    public static void main(String[] args) {
        // 사용자로부터 입력을 받기 위해 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        // 배열의 요소 개수 입력
        System.out.println("요소수 : ");
        int num = stdIn.nextInt();

        // 입력받은 크기만큼 배열 x 생성
        int[] x = new int[num];

        // 배열 x의 각 요소를 사용자로부터 입력받음
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = stdIn.nextInt();
        }

        // 삽입할 인덱스 입력받음
        System.out.println("삽입할 인덱스");
        int idx = stdIn.nextInt();

        // 삽입할 값 입력받음
        System.out.println("삽입할 값");
        int n = stdIn.nextInt();

        // 배열 x에서 idx 위치에 n을 삽입한 결과를 배열 y에 저장
        int[] y = arrayInsOf(x, idx, n);

        // 새로운 배열 y 출력
        for (int i = 0; i < y.length; i++)
            System.out.println("y[" + i + "]:" + y[i]);
    }
}
