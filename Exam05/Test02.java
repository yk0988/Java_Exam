import java.util.Scanner;
//연산문,반복,조건문//
public class Test02 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);
        int rerty;
        System.out.println("계절을 찾습니다.");
        do{
            int month; //월 저장
            do{
                System.out.println("몇 월입니까?");
                month = stdIn.nextInt();
            }while(month < 1 || month > 12);


            if(month >=3 && month <=5)
            System.out.println("봄");
            //자바(Java)에서 &&는 논리 AND 연산자로, 두 개의 조건이 모두 참일 때만 결과가 참이 되는 논리 연산//

            else if(month >= 6 && month <= 8)
            System.out.println("여름");

            else if(month >= 9 && month <= 11)
            System.out.println("가을");


            else if(month == 12 || month == 1 || month == 2)
                //자바(Java)에서 ||는 논리 OR 연산자로, 두 개의 조건 중 하나라도 참이면 결과가 참이 되는 논리 연산//
                //==는 비교 연산자로, 두 값이 같은지를 확인할 때 사용. 두 값이 동일하면 true, 그렇지 않으면 false를 반환//

                    System.out.println("겨울");

            System.out.println("다시? 1 yes / 2 no");
            rerty = stdIn.nextInt();
        } while (rerty == 1);//rerty == 1: 반복을 제어하는 비교 연산자//
    }
}
