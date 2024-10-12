import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
         System.out.println("정수값:");
            int n= stdIn.nextInt();
            for(int i = 1; i <= n; i++)
            System.out.println(i + "제곱은" + i * i + "입니다.");

    }
}
