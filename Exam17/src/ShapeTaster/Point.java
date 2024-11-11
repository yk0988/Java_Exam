package ShapeTaster;


public class Point extends Shape {
    public Point() { // 생성자 이름 수정
    }


    public String toString() {
        return "point";
    }

    @Override
    public void draw() { // 메서드 이름 수정
        System.out.println('+');
    }
}
