import java.util.Scanner;

public class Test01_1 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
         System.out.println("정수값:");
            int n= stdIn.nextInt();
            for(int i = 1, j = 1; i <= n; i++, j = i *i)
            System.out.println( i + "제곱은" + j + "입니다.");

    }
}
