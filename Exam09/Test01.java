package Exam09;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

            Random rand = new Random();
            Scanner stdIn = new Scanner(System.in);

            String[] dayKoran = {"일", "월", "화", "수", "목", "금", "토"};
            String[] dayEnglish = {"sun", "mon", "tues", "wedn", "thur", "fri", "sat"};

            System.out.println("요일명을 영어 소문자로 입력하시오");

            /*retry는 사용자가 퀴즈를 반복할지를 결정하는 변수 ,반복여부 결정*/

            int retry;
            int last = -1;

            /*last = -1;은 첫 번째 랜덤값을 처리할 때 중복을 피하기 위해 사용되는 초기값.
             실제 코드에서는 이 값이 -1에서 시작되기 때문에 처음에는 아무 요일과도 비교되지 않고,
             이후에는 직전의 요일을 추적하며 중복을 피하게 됨.*/

        do {
            int day;
            do {
                day = rand.nextInt(7);  // 0부터 6까지 랜덤한 정수(요일)를 생성
            } while (day == last);  // 만약 랜덤으로 나온 요일이 last(이전 요일)와 같으면 다시 뽑기
            last = day;  // 현재 선택된 요일을 last에 저장하여 다음 반복에서 비교에 사용


            while (true) {
                System.out.println(dayKoran[day] + "요일");  // 현재 요일(한국어)을 출력
                String s = stdIn.next();  // 사용자로부터 입력받음

                if (s.equals(dayEnglish[day])) break;  // 사용자가 입력한 값이 정답이면 루프 종료
                System.out.println("틀렸습니다.");  // 사용자가 틀렸을 경우 출력
            }
            System.out.println("정답입니다. 다시 1.yes 2.nonono");
            retry = stdIn.nextInt();  // 퀴즈를 다시 할지 여부를 묻는 입력 받기
        } while (retry == 1);  // retry가 1이면 반복, 아니면 종료

    }
    }
