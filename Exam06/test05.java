import java.util.Scanner;
// no2 . 10진수 정수를 8진수,16진수로 표시하자 /

public class test05 {
    public static void main(String[] args) {

                Scanner stdIn = new Scanner(System.in);
        System.out.println("정수");
        int x =stdIn.nextInt();
        System.out.printf("8진수는 %0 이고 16진수는 %x이다. %n", x, x);
    }
}

// printf 함수는 형식 문자열을 사용하여 다양한 데이터 타입을 출력함
//1. 정수형 출력
//%d : 10진수로 정수를 출력
//%i : %d와 동일하게 10진수 정수를 출력
//%o : 8진수로 정수를 출력
//%x : 16진수로 정수를 출력 (소문자)
//%X : 16진수로 정수를 출력 (대문자)
//%u : 부호 없는 10진수로 정수를 출력

//2. 실수형 출력
//%f : 소수점이 있는 실수를 출력
//%e : 지수 형식으로 실수를 출력 (예: 1.23e+03)
//%E : 지수 형식으로 실수를 출력 (대문자 E 사용)
//%g : 값에 따라 %f 또는 %e 형식으로 실수를 출력
//%G : 값에 따라 %f 또는 %E 형식으로 실수를 출력

//3. 문자와 문자열 출력
//%c : 단일 문자를 출력
//%s : 문자열을 출력

//4. 기타
//%% : % 기호 자체를 출력
//%p : 포인터의 주소 값을 출력//