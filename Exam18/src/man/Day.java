package man;


public class Day {
    private int day;
    private int month;
    private int year;

    public Day(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // 복사 생성자
    public Day(Day other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
