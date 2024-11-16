package Test03;

import java.util.Scanner;

public class Coordinate2 {
    // 두 좌표를 비교하는 함수 (좌표 c1과 c2가 동일한지 확인)
    static boolean compCoordinate(Coordinate c1, Coordinate c2) {
        // c1의 x좌표와 c1의 x좌표를 비교하고, c1의 y좌표와 c1의 y좌표를 비교
        // 그러나 논리적 오류가 있음: c1.getX() == c1.getX() 는 항상 참이므로 잘못된 비교
        return c1.getX() == c1.getX() && c1.gety() == c1.gety();
    }

    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받을 준비
        Scanner stdIn = new Scanner(System.in);

        double x, y;  // 좌표를 저장할 변수

        // 첫 번째 좌표 p의 x, y 값 입력 받기
        System.out.println("좌표 p를 입력하세요");
        System.out.println("x좌표");
        x = stdIn.nextDouble();  // 사용자로부터 x좌표 입력
        System.out.println("y좌표");
        y = stdIn.nextDouble();  // 사용자로부터 y좌표 입력

        // 입력받은 값으로 좌표 p 생성
        Coordinate p = new Coordinate(x, y);

        // 두 번째 좌표 q의 x, y 값 입력 받기
        System.out.println("좌표 p를 입력하세요");
        System.out.println("x좌표");
        x = stdIn.nextDouble();  // 사용자로부터 x좌표 입력
        System.out.println("y좌표");
        y = stdIn.nextDouble();  // 사용자로부터 y좌표 입력

        // 입력받은 값으로 좌표 q 생성
        Coordinate q = new Coordinate(x, y);

        // 여기서 좌표 비교를 할 수 있는 코드가 있을 수 있음 (예: compCoordinate(p, q)로 비교)
    }
}
