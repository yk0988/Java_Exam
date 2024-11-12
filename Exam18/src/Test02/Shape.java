package Test02;
public abstract class Shape {

    public abstract void draw(); // 메서드 이름 수정
    public void print() {
        System.out.println(toString());
        draw(); // 메서드 이름 일치
    }
}
