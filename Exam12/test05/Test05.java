package test05;

public class Test05 {
    static boolean addMatric(int[][] x, int[][] y, int[][] z) {
        // 행렬 크기가 일치하는지 확인
        if (x.length != y.length || y.length != z.length)
            return false;

        for (int i = 0; i < x.length; i++) {
            if (x[i].length != y[i].length || y[i].length != z[i].length)
                return false;
        }

        // 행렬의 각 요소를 더해서 z에 저장
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[i].length; j++) {
                z[i][j] = x[i][j] + y[i][j];

        }

        return true;  //
    }

    // 행렬을 출력하는 함수
    static void printMatric(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");  // 공백으로 구분하여 출력
            System.out.println();  // 한 행 출력 후 줄바꿈

        }
    }

    public static void main(String[] args) {

            // 두 개의 행렬을 준비
            int[][] a = {{1, 2, 3}, {4, 5, 6}};
            int[][] b = {{6, 3, 4}, {5, 1, 2}};
            int[][] c = new int[2][3];  // 결과를 저장할 행렬

            // 행렬 a와 b를 더하여 c에 저장
            if (addMatric(a, b, c)) {
                // 행렬 a, b, c 출력
                System.out.println("행렬 a:");
                printMatric(a);
                System.out.println("\n행렬 b:");
                printMatric(b);
                System.out.println("\n행렬 c:");
                printMatric(c);
            }
        }
    }
