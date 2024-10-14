//3개의 정수값을 읽어서 합계와 평균을 구하자! //
//평균은 캐스트 연산자로 표현
//캐스트 연산자 사용 이유-
//데이터의 정확성이나 범위를 맞추기 위해서.
//다른 자료형 간의 연산을 수행할 때 명시적으로 변환하여 문제를 피하기 위해서.

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        System.out.println("정수값 x y z 의 평균을 구합니다");
        System.out.println("x값"); int x = stdIn.nextInt();
        System.out.println("x값"); int y = stdIn.nextInt();
        System.out.println("x값"); int z = stdIn.nextInt();


        double ave =(x + y +z) /3;
        System.out.printf("x y z의 평균은 %.3f 입니다 %n", ave);
        //%f : 소수점이 있는 실수를 출력

        }

    }

