package Car;

class ExCar extends Car {
    private double totalMileage; // 총 주행 거리

    // 생성자
    public ExCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
        super(name, width, height, length, fuel, purchaseDay);
        totalMileage = 0.0;
    }

    // 총 주행 거리 조회
    public double getTotalMileage() {
        return totalMileage;
    }

    // 사양 표시
    public void putSpec() {
        super.putSpec();
        System.out.printf("총 주행 거리: %.2fkm\n", totalMileage);
    }

    // X방향으로 dx, Y방향으로 dy 이동
    public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy); // 이동 거리
        if (!super.move(dx, dy)) { // 이동할 수 없다면 - 연료 부족
            return false;
        } else {
            totalMileage += dist; // 총 주행 거리 증가
            return true; // 이동 완료
        }
    }
}

