imimport java.util.Scanner;

public class Test07 {
    // 배열 a에서 idx 위치부터 n개의 요소를 삭제하고, 뒤에 있는 요소들을 앞으로 한 칸씩 이동
    static void aryRmv(int[] a, int idx, int n) {
        if (idx >= 0 && idx < a.length) { // 유효한 인덱스 범위 체크
            int idx2 = idx + n - 1; // 삭제하려는 마지막 인덱스 계산
            if (idx2 > a.length - n - 1) {
                idx2 = a.length - n - 1; // 삭제 범위가 배열의 끝을 초과하지 않도록 수정
            }
            // idx부터 마지막 요소까지 이동
            for (int i = idx; i < a.length - 1; i++) {
                a[i] = a[i + 1]; // 한 칸씩 앞당기기
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 배열 크기 입력
        System.out.println("요소 수 : ");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        // 배열 요소 입력
        for (int i = 0; i < num; i++) {
            System.out.println("a[" + i + "]:");
            a[i] = stdIn.nextInt();
        }

        // 삭제할 요소의 인덱스와 삭제할 요소의 개수 입력
        System.out.println("삭제할 요소의 인덱스");
        int idx = stdIn.nextInt();
        System.out.println("삭제할 요소의 수");
        int n = stdIn.nextInt();

        // 배열에서 요소 삭제
        aryRmv(a, idx, n);

        // 삭제 후 배열 상태 출력
        for (int i = 0; i < num; i++) {
            System.out.println(" a[" + i + "]=" + a[i]);
        }
    }
}
