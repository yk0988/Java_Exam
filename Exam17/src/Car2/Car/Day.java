package Car2.Car;

public class Day {
    private int year;
    private int month;
    private int day;

    // 생성자
    public Day(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 복사 생성자
    public Day(Day other) {
        this(other.year, other.month, other.day);
    }

    // 윤년 확인
    public boolean isLeap() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 연도 내 경과 일수
    public int dayOfYear() {
        // 월별 일수 계산 필요
        return day; // 임시로 설정
    }

    // 연도 내 잔여 일수
    public int leftDayOfYear() {
        return 365 - dayOfYear(); // 임시로 설정
    }

    // 날짜 변경 메서드들
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDate(int day) {
        this.day = day;
    }

    public void succeed() {
        // 하루 후
        day++;
    }

    public void precede() {
        // 하루 전
        day--;
    }

    public int compareTo(Day other) {
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }
        if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        }
        return Integer.compare(this.day, other.day);
    }

    public Day succeedingDay(int n) {
        return new Day(year, month, day + n); // n일 후
    }

    public Day precedingDay(int n) {
        return new Day(year, month, day - n); // n일 전
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }


        }

