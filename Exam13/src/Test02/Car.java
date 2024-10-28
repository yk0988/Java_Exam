package Test02;

class Car {
    private String name;
    private String number;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double thankge;
    private double fuel;
    private double sfc;

    Car(String name, String number, int width, int height, int length,
        double thankge, double fuel, double sfc) {

        this.name = name;
        this.number = number;
        this.width = width;
        this.height = height;
        this.length = length;
        this.thankge = thankge;
        this.fuel = (fuel <= thankge) ? fuel : thankge;
        this.sfc = sfc;
        x = y = 0.0;
    }

    double getX() { return x; }
    double getY() { return y; }
    double getFuel() { return fuel; }

    void putSpec() {
        System.out.println("이름: " + name);
        System.out.println("번호: " + number);
        System.out.println("전폭: " + width + " mm");
        System.out.println("전고: " + height + " mm");
        System.out.println("전장: " + length + " mm");
        System.out.println("탱크: " + thankge + " 리터");
        System.out.println("연비: " + sfc + " km/리터");
    }

    boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy);
        double f = dist / sfc;

        if (f > fuel) {
            return false;
        } else {
            fuel -= f;
            x += dx;
            y += dy;
            return true;
        }
    }

    void refuel(double df) {
        if (df > 0) {
            fuel += df;
            if (fuel > thankge) {
                fuel = thankge;
            }
        }
    }
}
