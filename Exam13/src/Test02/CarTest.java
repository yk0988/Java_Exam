package Test02;

class CarTest {
public static void main(String[] args) {
    Car k3 = new Car("k3", "서울999-00", 1660, 1500, 3640, 40.0, 35.0, 12.0);
    Car k5 = new Car("k5", "서울999-88", 1660, 1500, 3695, 41.0, 35.0, 12.0);

    k3.putSpec();
    System.out.println();
    k5.putSpec();
}
}