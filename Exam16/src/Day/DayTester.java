package Day;

import java.util.Scanner;

public class DayTester {
    static Scanner stdIn = new Scanner(System.in);

    // 날짜 정보 출력
    static void display(Day day) {
        System.out.println(day + "에 관한 정보");
        System.out.println("윤년: " + (day.isLeap() ? "입니다." : "이 아닙니다."));
        System.out.println("연도 내 경과 일수: " + day.dayOfYear());
        System.out.println("연도 내 잔여 일수: " + day.leftDayOfYear());
    }

    // 날짜 변경
    static void change(Day day) {
        System.out.println("[1]연월일을 변경 [2]연을 변경");
        System.out.println("[3]월을 변경 [4]일을 변경");
        System.out.println("[5]1일 뒤 [6]1일 앞");
        System.out.print("[7]일 뒤 [8]일 앞:");
        int change = stdIn.nextInt();

        int y = 0, m = 0, d = 0, n = 0;

        if (change == 1 || change == 2) {
            System.out.print("연: ");
            y = stdIn.nextInt();
        }

        if (change == 1 || change == 3) {
            System.out.print("월: ");
            m = stdIn.nextInt();
        }

        if (change == 1 || change == 4) {
            System.out.print("일: ");
            d = stdIn.nextInt();
        }

        if (change == 7 || change == 8) {
            System.out.print("며칠: ");
            n = stdIn.nextInt();
        }

        switch (change) {
            case 1: day.setYear(y); break; // 연으로 설정
            case 2: day.setMonth(m); break; // 월로 설정
            case 3: day.setDate(d); break; // 일로 설정
            case 5: day.succeed(); break; // 하루 후
            case 6: day.precede(); break; // 하루 전
            case 7: day.succeedingDay(n); break; // n일 후
            case 8: day.precedingDay(n); break; // n일 전
        }
        System.out.println(day + "로 변경되었습니다.");
    }

    // 두 날짜 비교
    static void compare(Day day) {
        System.out.println("비교 대상 날짜를 입력하세요.");
        System.out.print("연: "); int y = stdIn.nextInt();
        System.out.print("월: "); int m = stdIn.nextInt();
        System.out.print("일: "); int d = stdIn.nextInt();

        Day d2 = new Day(y, m, d); // 비교 대상 날짜
        int comp = day.compareTo(d2); // 날짜 비교
        System.out.print(day);

        switch (comp) {
            case -1: System.out.println("가 더 앞입니다."); break;
            case 1: System.out.println("가 더 뒤입니다."); break;
            case 0: System.out.println("와 같습니다."); break;
        }
    }

    // 전후 날짜
    static void beforeAfter(Day day) {
        System.out.print("[1]내일 [2]어제 [3]n일 후 [4]n일 전:");
        int type = stdIn.nextInt();
        int n = 0;

        if (type == 3 || type == 4) {
            System.out.print("며칠: ");
            n = stdIn.nextInt();
        }

        System.out.print("이 날은");
        switch (type) {
            case 1: System.out.print(day.succeedingDay(n)); break; // 하루 후
            case 2: System.out.print(day.precedingDay(n)); break; // 하루 전
            case 3: System.out.print(day.after(n)); break; // n일 후
            case 4: System.out.print(day.before(n)); break; // n일 전
        }
        System.out.println("입니다.");
    }

    public static void main(String[] args) {
        System.out.println("날짜를 입력하세요:");
        System.out.print("연: "); int y = stdIn.nextInt();
        System.out.print("월: "); int m = stdIn.nextInt();
        System.out.print("일: "); int d = stdIn.nextInt();

        Day day = new Day(y, m, d); // 입력한 날짜

        while (true) {
            System.out.println("[1]날짜 관련 정보 표시 [2]날짜 변경 [3] 다른 날짜와 비교" +
                    "[4]전후 날짜 [5] 종료:");
            int menu = stdIn.nextInt();
            if (menu == 5) break;

            switch (menu) {
                case 1: display(day); break; // 날짜 관련 정보 표시
                case 2: change(day); break; // 날짜 변경
                case 3: compare(day); break; // 다른 날짜와 비교
                case 4: beforeAfter(day); break; // 전후 날짜 구하기
            }
        }
    }
}