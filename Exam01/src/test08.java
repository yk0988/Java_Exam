import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("정수값");
        int n =stdIn.nextInt();

        if (n > 0)
            if(n % 10 == 0)
                System.out.println("이 값은  10의 배수 입니다");
               else
                System.out.println("이 값은  10의 배수가 아닙 입니다");
             else
                System.out.println("음의 정수값을 입력했습니다");

    }
}
