package test01;

import java.util.Scanner;

public class test01 {

    // 배열에서 값 x와 일치하는 인덱스를 찾아 반환하는 함수
    static int[] arraySrchIdx(int[] a, int x) {
        int count = 0;

        // 배열 a에서 값 x와 일치하는 요소가 몇 개 있는지 세기
        for (int i = 0; i < a.length; i++)
            if (a[i] == x) count++;

        // x와 일치하는 인덱스를 저장할 배열 생성 (일치하는 개수만큼 크기 설정)
        int[] c = new int[count--];

        // 배열을 뒤에서부터 탐색하여 일치하는 인덱스를 c 배열에 저장
        for (int i = a.length - 1; count >= 0; i--)
            if (a[i] == x)
                c[count--] = i; // 일치하는 인덱스를 저장하고 count 감소

        return c; // 결과 배열 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 배열의 크기 입력받기
        System.out.println("요소 수 : ");
        int num = stdIn.nextInt();

        // 크기만큼 배열 x 생성
        int[] x = new int[num];

        // 배열 x의 각 요소 값 입력받기
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]: ");
            x[i] = stdIn.nextByte();  // x 배열의 값을 입력받음
        }

        // 탐색할 값 입력받기
        System.out.println("탐색할 값: ");
        int n = stdIn.nextInt();

        // arraySrchIdx 함수를 호출하여 탐색할 값의 인덱스를 찾음
        int[] b = arraySrchIdx(x, n);

        // 일치하는 값이 없으면 메시지 출력
        if (b.length == 0)
            System.out.println("일치하는 요소가 없습니다.");
        else {
            // 일치하는 인덱스 출력
            System.out.println("일치하는 요소의 인덱스");
            for (int i = 0; i < b.length; i++)
                System.out.println(b[i]);
        }
    }
}
