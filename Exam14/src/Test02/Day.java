package Test02;

public class Day {
    private int year = 1;    // 연도 (기본값: 1)
    private int month = 1;   // 월 (기본값: 1)
    private int date = 1;    // 일 (기본값: 1)

    // 기본 생성자
    public Day() {}

    // 연도만 입력받는 생성자
    public Day(int year) {
        this.year = year;
    }

    // 연도와 월을 입력받는 생성자
    public Day(int year, int month) {
        this(year);        // year를 설정
        this.month = month;
    }

    // 연도, 월, 일을 모두 입력받는 생성자
    public Day(int year, int month, int date) {
        this(year, month);  // year, month를 설정
        this.date = date;
    }

    // 복사 생성자: 다른 Day 객체의 값으로 새로운 Day 객체를 생성
    public Day(Day d) {
        this(d.year, d.month, d.date);
    }

    // getter 메서드들
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDate() { return date; }

    // setter 메서드들
    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDate(int date) { this.date = date; }

    // set 메서드: 연도, 월, 일 모두 한 번에 설정
    public void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    // dayOfWeek 메서드: 요일을 계산하여 반환 (0: 일요일, 1: 월요일, ...)
    public int dayOfWeek() {
        int y = year;
        int m = month;

        // 1월과 2월은 이전 연도로 취급하여 계산
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }

        // Zeller의 공식으로 요일 계산
        return (y + y / 4 - y / 100 + y / 400 + (13 * (m + 1)) / 5 + date) % 7;
    }

    // equalTo 메서드: 두 Day 객체가 같은 날짜인지 비교
    public boolean equalTo(Day d) {
        return year == d.year && month == d.month && date == d.date;
    }

    // toString 메서드: 날짜를 문자열로 반환 (요일 포함)
    public String toString() {
        String[] daysOfWeek = {"일", "월", "화", "수", "목", "금", "토"};  // 요일 배열
        int day = dayOfWeek();  // 요일 계산
        // "YYYY년 MM월 DD일(요일)" 형식으로 반환
        return String.format("%04d년 %02d월 %02d일(%s)", year, month, date, daysOfWeek[day]);
    }
}
