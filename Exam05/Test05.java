import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("피라미드를 표시합니다");
        System.out.println("단수값 : ");
        int n = stdIn.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++)
                System.out.println(' ');
            for (int j = 1; j <= 2-i; j++)
                System.out.println('*');
            System.out.println();
        }
    }
}
