package Exam09;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
                Random rand = new Random();
                Scanner stdIn = new Scanner(System.in);

                String[] dayKoran = {"일", "월", "화", "수", "목", "금", "토"};
                String[] dayEnglish = {"sun", "mon", "tues", "wedn", "thur", "fri", "sat"};

                System.out.println("요일명을 영어 소문자로 입력하시오");

                int retry;
                int last = -1;

                do {
                    int day;
                    do {
                        day = rand.nextInt(7); // 랜덤으로 0부터 6까지의 숫자 생성
                    } while (day == last); // 직전과 같은 요일이 나오지 않도록 처리
                    last = day; // 현재 요일을 기억

                    int action;
                    do {
                        System.out.println(dayKoran[day] + "요일");
                        String s = stdIn.next();

                        if (s.equals(dayEnglish[day])) {
                            System.out.println("정답.");
                            break;
                        }

                        System.out.println("땡!");

                        // action 변수에 대해 올바른 입력을 받을 때까지 반복
                        do {
                            System.out.println("어찌할까요 1 재입력 0 정답보기");
                            action = stdIn.nextInt(); // action 입력 받기
                        } while (action != 0 && action != 1); // 0 또는 1이 아닌 입력은 무시

                        if (action == 0) {
                            System.out.println(dayKoran[day] + "요일은 " + dayEnglish[day] + "입니다.");
                            break; // 정답을 보여준 후 반복문 종료
                        }
                    } while (action == 1); // action이 1일 때 재입력

                    // 퀴즈 반복 여부 결정
                    System.out.println("다시 하시겠습니까? 1. yes 2. no");
                    retry = stdIn.nextInt();
                } while (retry == 1); // retry가 1이면 계속 반복
            }
        }
