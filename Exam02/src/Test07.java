import java.util.Scanner;
//두 정수값을 읽어서 내림차수 큰수 정렬//
public class Test07 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수a:"); int a = stdIn.nextInt();
        System.out.println("정수b:"); int b = stdIn.nextInt();

        if (a < b) {
            int t = a;
            a=b;
            b=t;
        }
        System.out.println("a>=b는 "+a+"입니다.");
        System.out.println("변수 a는 "+a+"입니다.");
        System.out.println("변수 b는 "+b+"입니다.");
    }
}
