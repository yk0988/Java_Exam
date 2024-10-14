-//3개의 정수값을 읽어서 합계와 평균을 구하자! //
//평균은 실수로 표현

import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        System.out.println("정수값 x y z 의 평균을 구합니다");
        System.out.println("x값"); int x = stdIn.nextInt();
        System.out.println("x값"); int y = stdIn.nextInt();
        System.out.println("x값"); int z = stdIn.nextInt();


        double ave =(x + y +z) /3.0;
        System.out.printf("x y z의 평균은 %.3f 입니다 %n", ave);
        //%f : 소수점이 있는 실수를 출력

        }

    }

 