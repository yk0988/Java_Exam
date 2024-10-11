import java.util.Scanner;
//읽은 두 값의차가 11이상인지를 표시하는 방법 (조건 연산문)//
public class Test03_02 {
    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);

        System.out.println("정수 a:"); int a = stdIn.nextInt();
        System.out.println("정수 b:"); int b = stdIn.nextInt();

        int diff = a >= b ? a - b : b - a;

        System.out.println("두 값의 차는" + (diff <= 10 ? "10 이하":"11 이상") +"입니다.");

    }
}
