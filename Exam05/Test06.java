import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("숫자 피라미드를 표시합니다");
        System.out.println("단수값 :");

        int n = stdIn.nextInt();

        for (int i=1; i<=n; i++){
            for (int j =1; j <=n; i++)
                System.out.println(' ');
            for (int j=1; j <= 2 * i -1; j++)
                System.out.println(i%10);
                System.out.println();
        }


    }
}
