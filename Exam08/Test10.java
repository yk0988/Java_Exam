package Exam08;

import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] monthString = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        System.out.println("해당월의 영어 단어");
        System.out.println("첫 글자는 대문자, 나머지는 소문자");

        int retry;
        int last = -1;

        do {
            int month;
            do {
                month = rand.nextInt(12);
            } while (month == last);

            while (true) {
                System.out.println((month + 1) + "월:");
                String s = stdIn.next();

                if (s.equals(monthString[month])) break;
                System.out.println("틀렸습니다");
            }
            System.out.println("정답입니다. 다시한번? 1 -yes 0 - no");
            retry =stdIn.nextInt();
            }while (retry==1);
            }
        }