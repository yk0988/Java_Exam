package Test04;

import java.util.Scanner;

public class CoordinateTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요");
        System.out.println("x좌표");
        double x = stdIn.nextDouble();  // nextInt() -> nextDouble()으로 수정
        System.out.println("y좌표");
        double y = stdIn.nextDouble();  // nextInt() -> nextDouble()으로 수정

        Coordinate p = new Coordinate(x, y);
        System.out.println("p = " + p);

        // p를 복사해서 q를 만듦
        Coordinate q = new Coordinate(p);
        System.out.println("q와 p를 통일 좌표로 만들었음");
        System.out.println("q = " + q);

        // p와 q 비교
        if (p.equalTo(q))
            System.out.println("p와 q가 같음");
        else
            System.out.println("p와 q가 다름");

        // 기본 좌표 c1과 지정된 좌표 c2 생성
        Coordinate c1 = new Coordinate();
        Coordinate c2 = new Coordinate(1.1, 2.2);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        // 좌표 배열을 생성하고 각 항목 초기화
        Coordinate[] a = new Coordinate[3];
        for (int i = 0; i < a.length; i++)
            a[i] = new Coordinate();  // 기본 생성자를 통해 초기화

        // 배열의 좌표 출력
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
