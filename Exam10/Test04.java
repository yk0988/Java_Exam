package Exam10;

import java.util.Scanner;

public class Test04 {
    static String Season0f(int m) {
        switch (m) {
            case 3:
            case 4:
            case 5:
                return "봄";
            case 6:
            case 7:
            case 8:
                return "여름";
            case 9:
            case 10:
            case 11:
                return "가을";
            case 12:
            case 1:
            case 2:
                return "겨울";
        }

        return "";
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int month;
        do {
            System.out.println("몇 월 입니까(1~12):");
            month = stdIn.nextInt();
        } while (month < 1 || month > 12);

        System.out.println("해당 월의 계절은 " + Season0f(month) + "입니다.");
    }
}

