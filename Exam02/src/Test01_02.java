import java.util.Scanner;

//실수값 중에 큰 쪽을 표시 하는 연산자//
public class Test01_02 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("실수 a:"); double a = stdIn.nextDouble();
        System.out.println("실수 b:"); double b = stdIn.nextDouble();

        double max = a > b ? a: b;
        System.out.println("큰 쪽의 값은 "+max+"입니다.");
    }
}
