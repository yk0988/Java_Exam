import java.util.Scanner;
//읽은 두 정수값의 차를 표시함 (연산자)
public class Test02_02 {
    public static void main(String[] args) {
       Scanner stdIn= new Scanner(System.in);
        System.out.println("정수 a"); int a = stdIn.nextInt();
        System.out.println("정수 b"); int b = stdIn.nextInt();

        int diff = a>=b ? a - b : b - a ;



        System.out.println("두 값의 차는 "+diff+"입니다.");

        }


}
