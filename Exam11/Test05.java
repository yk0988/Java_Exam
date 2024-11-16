package Exam11;

import java.util.Scanner;

public class Test05 {

    // 배열에서 key 값을 처음 찾은 인덱스를 반환하는 선형 검색 메서드
    static int linerSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i; // key 값을 찾으면 해당 인덱스 반환
            }
        }
        return -1; // key 값을 찾지 못하면 -1 반환
    }

    // 배열에서 key 값을 마지막으로 찾은 인덱스를 반환하는 선형 검색 메서드
    static int linerSearchR(int[] a, int key) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == key) {
                return i; // key 값을 찾으면 해당 인덱스 반환
            }
        }
        return -1; // key 값을 찾지 못하면 -1 반환
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 배열의 크기 입력 받기
        System.out.print("요소 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num]; // 배열 생성

        // 배열 요소 입력 받기
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]:");
            x[i] = stdIn.nextInt(); // 배열 각 요소 입력
        }

        // 찾을 값 입력 받기
        System.out.print("찾는값: ");
        int ky = stdIn.nextInt();

        // 선형 검색을 통해 첫 번째, 마지막 인덱스 찾기
        int idxTop = linerSearch(x, ky);
        int idxBtm = linerSearchR(x, ky);

        // 검색 결과 출력
        if (idxTop == -1) {
            System.out.println("해당 값은 존재하지 않습니다.");
        } else if (idxTop == idxBtm) {
            System.out.println("해당 값은 x[" + idxTop + "]에 있습니다.");
        } else {
            System.out.println("해당 값의 요소가 여러 개 존재함");
        }
        System.out.println("가장 앞에 위치한 값은 x[" + idxTop + "]에 있습니다.");
        System.out.println("가장 뒤에 위치한 값은 x[" + idxBtm + "]에 있습니다.");
    }
}

