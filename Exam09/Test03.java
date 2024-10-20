package Exam09;
//중간값 구하기//
import java.util.Scanner;

public class Test03 {
    static int med3(int a, int b, int c){
        if (a >= b)                // a가 b 이상이면
            if (b >= c)            // b가 c 이상이면
                return b;          // 중간값은 b
            else if (a <= c)       // a가 c 이하이면
                return a;          // 중간값은 a
            else
                return c;          // 나머지 경우 중간값은 c
        else if (a > c)            // a가 c보다 클 때
            return a;              // 중간값은 a
        else if (b < c)            // b가 c보다 작을 때
            return c;              // 중간값은 c
        else
            return b;              // 나머지 경우 중간값은 b
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a:"); int a = stdIn.nextInt();
        System.out.println("정수 b:"); int b = stdIn.nextInt();
        System.out.println("정수 c:"); int c = stdIn.nextInt();

        System.out.println("중간값은" + med3(a,b,c)+"입니다.");

        }
}
