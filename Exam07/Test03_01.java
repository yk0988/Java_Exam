public class Test03_01 {
    public static void main(String[] args) {

        // 반복을 int 형으로 제어 - 0.0 부터 1.0 까지 0.001씩 증가하며 제곱표현

        System.out.println("x                    x의 제곱");
        System.out.println("-----------------------------");


        for (int i = 0; i <= 1000; i++) {
            float x = (float) i / 1000;
            System.out.printf("%5.3f  %10.7f\n", x, x * x);
        }
    }
}
