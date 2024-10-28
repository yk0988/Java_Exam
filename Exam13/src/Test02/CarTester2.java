package Test02;

import java.util.Scanner;

class CarTester2 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("차량 데이터를 입력하세요.");
        System.out.print("이름: ");
        String name = stdin.next();
        System.out.print("번호: ");
        String number = stdin.next();
        System.out.print("전폭: ");
        int width = stdin.nextInt();
        System.out.print("전고: ");
        int height = stdin.nextInt();
        System.out.print("전장: ");
        int length = stdin.nextInt();
        System.out.print("탱크용량: ");
        double tank = stdin.nextDouble();
        System.out.print("연료량: ");
        double fuel = stdin.nextDouble();
        System.out.print("연비: ");
        double sfc = stdin.nextDouble();

        Car myCar = new Car(name, number, width, height, length, tank, fuel, sfc);

        while (true) {
            System.out.printf("현재 위치: (%.2f, %.2f)\n", myCar.getX(), myCar.getY());
            System.out.printf("남은 연료: %.2f\n", myCar.getFuel());
            System.out.print("이동하겠습니까?[ 0_No/1_Yes]: ");
            if (stdin.nextInt() == 0) break;
            System.out.print("X방향으로의 이동 거리: ");
            double dx = stdin.nextDouble();
            System.out.print("Y방향으로의 이동 거리: ");
            double dy = stdin.nextDouble();
            if (!myCar.move(dx, dy))
                System.out.println("연료 부족!!");
        }
    }
}