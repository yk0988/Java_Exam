import java.util.Scanner;
// 10진수 정수를 8진수,16진수로 표시하자/

public class test04 {
    public static void main(String[] args) {

                Scanner stdIn = new Scanner(System.in);

                System.out.println("정수:");
                int x = stdIn.nextInt();

                // 8진수 출력: %o를 사용
                System.out.printf("8진수는 %o 입니다.%n", x);

                // 16진수 출력: %x를 사용
                System.out.printf("16진수는 %x 입니다.%n", x);
                //printf("16진수는 %x 입니다.\n", x);//
    }
        }
