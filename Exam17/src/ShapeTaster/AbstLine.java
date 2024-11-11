package ShapeTaster;
public abstract class AbstLine extends Shape {

    private int length;

    public AbstLine(int length) {
        setLength(length);
    }

    public int getLength() { // 메서드 이름 수정
        return length;
    }

    protected void setLength(int length) { // 필요 시 protected로 변경 가능
        this.length = length;
    }

    @Override
    public String toString() { // @Override 어노테이션 추가
        return "AbstLine(length:" + length + ")";
    }
}

