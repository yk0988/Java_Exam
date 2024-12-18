package Test02;

public class TriangleLU extends AbstTriangle {
    // 좌상단이 직각인 이등변 삼각형을 생성한다.
    // 한 변의 길이를 인수로 받는다.
    // @param length 생성할 이등변 삼각형의 한 변의 길이
    public TriangleLU(int length) {
        super(length);
    }

    // toString은 좌상단이 직각인 삼각형의 정보를 문자열로 반환한다.
    // @return 문자열 "TriangleLU(length:3)"을 반환한다.
    // 3부분은 길이에 해당하는 값.
    public String toString() {
        return "TriangleLU(length: " + getLength() + ")";
    }

    // draw는 좌상단이 직각인 삼각형을 그린다.
    // 별표 '*'를 나열해서 그린다.
    public void draw() {
        for (int i = getLength(); i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}