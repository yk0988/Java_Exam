package Car2.Car;

public class Car {
    private String name; // 이름
    private int width; // 폭
    private int height; // 높이
    private int length; // 길이
    private double x; // 현재 위치의 X 좌표
    private double y; // 현재 위치의 Y 좌표
    private double fuel; // 남은 연료
    private Day purchaseDay; // 구입일

    // 생성자
    public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.fuel = fuel;
        this.x = 0.0;
        this.y = 0.0;
        this.purchaseDay = new Day(purchaseDay); // 복사 생성자 필요
    }

    // 현재 위치의 X좌표 불러오기
    public double getX() {
        return x;
    }

    // 현재 위치의 Y좌표 불러오기
    public double getY() {
        return y;
    }

    // 남은 연료 불러오기
    public double getFuel() {
        return fuel;
    }

    // 구입일 불러오기
    public Day getPurchaseDay() {
        return new Day(purchaseDay); // 복사본 반환
    }

    // 사양 표시
    public void putSpec() {
        System.out.println("이름: " + name);
        System.out.println("전폭: " + width + "mm");
        System.out.println("전고: " + height + "mm");
        System.out.println("전장: " + length + "mm");
    }

    public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy); // 이동 거리 계산

        if (dist > fuel) {
            return false; // 연료 부족으로 이동 불가
        } else {
            fuel -= dist; // 연료 감소
            x += dx; // x 좌표 이동
            y += dy; // y 좌표 이동
            return true; // 이동 성공
        }
    }
}
