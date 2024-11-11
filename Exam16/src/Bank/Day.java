package Bank;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Day {
    private int year = 1;  // 연
    private int month = 1; // 월
    private int date = 1;  // 일

    // 각 월의 일수
    private static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년
    };

    // 윤년 여부 판단
    public static boolean isLeap(int y) {
        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
    }

    // 해당 월의 일수
    private static int dayOfMonth(int y, int m) {
        return mdays[isLeap(y) ? 1 : 0][m - 1];
    }

    // 조정된 월 (1~12 범위 외의 값을 조정)
    private static int adjustedMonth(int m) {
        return m < 1 ? 1 : m > 12 ? 12 : m;
    }

    // 조정된 일
    private static int adjustedDay(int y, int m, int d) {
        if (d < 1) {
            return 1;
        }
        int dMax = dayOfMonth(y, m);
        return d > dMax ? dMax : d;
    }

    // 생성자(오늘 날짜)
    public Day() {
        GregorianCalendar today = new GregorianCalendar();
        this.year = today.get(Calendar.YEAR);
        this.month = today.get(Calendar.MONTH) + 1; // 월은 0부터 시작하므로 1을 더함
        this.date = today.get(Calendar.DATE);
    }

    // 생성자(year년 1월 1일)
    public Day(int year) {
        this.year = year;
        this.month = 1; // 기본값 1월
        this.date = 1;  // 기본값 1일
    }

    // 생성자(year년 month월 1일)
    public Day(int year, int month) {
        this.year = year;
        this.month = adjustedMonth(month);
        this.date = 1; // 기본값 1일
    }

    // 생성자(year년 month월 date일)
    public Day(int year, int month, int date) {
        this.year = year;
        this.month = adjustedMonth(month);
        this.date = adjustedDay(year, this.month, date);
    }

    // 생성자(d와 같은 날짜)
    public Day(Day d) {
        this(d.year, d.month, d.date);
    }

    // 연 가져오기
    public int getYear() {
        return year;
    }

    // 월 가져오기
    public int getMonth() {
        return month;
    }

    // 일 가져오기
    public int getDate() {
        return date;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = adjustedMonth(month);
    }

    public void setDate(int date) {
        this.date = adjustedDay(year, month, date);
    }

    public void set(int year, int month, int date) {
        this.year = year;
        this.month = adjustedMonth(month);
        this.date = adjustedDay(year, month, date);
    }

    public boolean isLeap() {
        return isLeap(year); // 클래스 메서드 버전의 isLeap 호출
    }

    public int dayOfWeek() {
        int y = year;
        int m = month;
        if (m <= 2) {
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }

    public boolean equalTo(Day d) {
        return year == d.year && month == d.month && date == d.date;
    }

    public String toString() {
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
        return String.format("%d년 %02d월 %02d일(%s)", year, month, date, wd[dayOfWeek()]);
    }

    // 연초부터 현재 날짜까지의 경과 일수
    public int dayOfYear() {
        int days = 0;
        for (int m = 1; m < month; m++) {
            days += dayOfMonth(year, m);
        }
        days += date;
        return days;
    }

    // 연말까지 남은 일수
    public int remainingDaysInYear() {
        return isLeap(year) ? 366 : 365 - dayOfYear();
    }

    // 두 날짜 비교
    public int compareTo(Day other) {
        if (year != other.year) {
            return Integer.compare(year, other.year);
        }
        if (month != other.month) {
            return Integer.compare(month, other.month);
        }
        return Integer.compare(date, other.date);
    }

    // 날짜를 하루 증가
    public void nextDay() {
        date++;
        if (date > dayOfMonth(year, month)) {
            date = 1;
            month++;
            if (month > 12) {
                year++;
                month = 1;
            }
        }
    }

    // 하루 뒤 날짜를 반환
    public Day succeedingDay() {
        Day temp = new Day(this);
        temp.nextDay();
        return temp;
    }

    // 하루 앞 날짜로 변경
    public void precede() {
        if (date > 1) {
            date--;
        } else {
            if (--month < 1) {
                year--;
                month = 12;
            }
            date = dayOfMonth(year, month);
        }
    }

    // 하루 앞 날짜를 반환
    public Day precedingDay() {
        Day temp = new Day(this);
        temp.precede();
        return temp;
    }

    // n일 뒤로 변경
    public void succeedDays(int n) {
        if (n < 0) {
            precedeDays(-n);
        } else {
            for (int i = 0; i < n; i++) {
                nextDay();
            }
        }
    }

    // n일 뒤의 날짜를 반환
    public Day after(int n) {
        Day temp = new Day(this);
        temp.succeedDays(n);
        return temp;
    }

    // n일 앞으로 변경
    public void precedeDays(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                precede();
            }
        }
    }

    // n일 앞의 날짜를 반환
    public Day before(int n) {
        Day temp = new Day(this);
        temp.precedeDays(n);
        return temp;
    }
}
