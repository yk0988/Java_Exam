package Test04;

import Test02.Day;

public class Period {
    private Day from; // 시작일
    private Day to;   // 종료일

    // 생성자
    public Period(Day from, Day to) {
        this.from = new Day(from);
        this.to = new Day(to);
    }

    public Day getFrom() {
        return new Day(from); // 시작일 반환
    }

    public Day getTo() {
        return new Day(to);   // 종료일 반환
    }

    public String toString() {
        return "[" + from + " ~ " + to + "]";
    }
}

