package ShapeTaster;

public abstract class AbstLine extends Shape {

    private int length; // 길이 변수

    // 생성자: 길이를 설정
    public AbstLine(int length) {
        setLength(length);
    }

    // 길이 값을 반환하는 getter
    public int getLength() {
        return length;
    }

    // 길이 값을 설정하는 setter
    protected void setLength(int length) {
        this.length = length;
    }

    // 객체 상태를 문자열로 반환
    @Override
    public String toString() {
        return "AbstLine(length:" + length + ")"; // 길이 포함
    }
}
