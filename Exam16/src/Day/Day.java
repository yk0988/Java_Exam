package Day;

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

    // 윤년 확인
    public boolean isLeap() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 연도 내 경과 일수
    public int dayOfYear() {
        // 간단한 구현 예시 (실제 구현에서는 월별 일수를 고려해야 함)
        return day; // 임시로 설정
    }

    // 연도 내 잔여 일수
    public int leftDayOfYear() {
        // 간단한 구현 예시 (실제 구현에서는 월별 일수를 고려해야 함)
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
        // 날짜 비교 로직 구현
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }
        if (this.month != other.month) {
            return Integer.compare(this.month, other.month);
        }
        return Integer.compare(this.day, other.day);
    }

    public Day succeedingDay(int n) {
        // 하루 후의 날짜 반환
        return new Day(year, month, day + 1); // 임시로 설정
    }

    public Day precedingDay(int n) {
        // 하루 전의 날짜 반환
        return new Day(year, month, day - 1); // 임시로 설정
    }

    public Day after(int n) {
        return new Day(year, month, day + n); // n일 후
    }

    public Day before(int n) {
        return new Day(year, month, day - n); // n일 전
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

