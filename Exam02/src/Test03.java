import java.sql.SQLOutput;
import java.util.Scanner;
//if문 읽은 두 값의 차가 10이하인지 표현하는 방법//
public class Test03 {
    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);

        System.out.println("정수 a:"); int a = stdIn.nextInt();
        System.out.println("정수 b:"); int b = stdIn.nextInt();

        int diff = a >= b ? a - b : b - a;

        if(diff<=10)
            System.out.println("두 값의 차는 10 이하 입니다.");
        else
            System.out.println("두 값의 차는 11 이상 입니다.");

    }
}
