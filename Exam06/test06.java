import java.util.Scanner;
// no2 . 10진수 정수를 8진수,16진수로 표시하자 /

public class test06 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("변수 x는 float 형입니다. 변수 y는 double 형 입니다.");
        System.out.println("x: ");
        float x = stdIn.nextFloat();
        System.out.println("y: ");
        double y =stdIn.nextDouble();

        System.out.println("x =" + x);
        System.out.println("y =" + y);
     }

    }

