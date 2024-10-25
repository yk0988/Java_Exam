import java.util.Scanner;

public class Test06 {

    // 행렬 복사 함수
    static int[][] aryClone2(int[][] a) {
        int[][] c = new int[a.length][];  // 행 수만큼 복사본 배열 생성
        for (int i = 0; i < a.length; i++) {
            c[i] = new int[a[i].length];  // 각 행을 복사할 배열 생성
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j];  // 값을 복사
            }
        }
        return c;
    }

    // 행렬 출력 함수
    static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");  // 공백으로 구분하여 출력
            }
            System.out.println();  // 한 행 출력 후 줄바꿈
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 행렬 크기 입력 받기
        System.out.print("행렬의 행 수: ");
        int height = stdIn.nextInt();
        System.out.print("행렬의 열 수: ");
        int width = stdIn.nextInt();

        // 행렬 a 생성
        int[][] a = new int[height][width];

        // 행렬 a의 값을 입력 받기
        for (int i = 0; i < a.length; i++) {  // 행을 순회
            for (int j = 0; j < a[i].length; j++) {  // 열을 순회
                System.out.printf("a[%d][%d]: ", i, j);  // 값 입력 안내
                a[i][j] = stdIn.nextInt();  // 사용자로부터 값 입력
            }
        }

        // 행렬 a를 복사하여 ca에 저장
        int[][] ca = aryClone2(a);

        // 원본 행렬 a 출력
        System.out.println("행렬 a:");
        printMatrix(a);

        // 복사본 행렬 ca 출력
        System.out.println("행렬 a의 복사본:");
        printMatrix(ca);

        stdIn.close();  // Scanner 객체 종료
    }
}
