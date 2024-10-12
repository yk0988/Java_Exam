import java.util.Scanner;

public class Test04_1 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.println("단수값:");
        int n = stdIn.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++)
                System.out.println('*');
            System.out.println();
        }

    }
}
