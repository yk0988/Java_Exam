public class Test02 {
    public static void main(String[] args) {

        // float형 변수 0.0 부터 1.0 까지 0.001씩 증가
        //그 옆 int형 변수를 0부터 1000까지 1씩 증가시켜가며 1000으로 나눈값을 표시함

        System.out.println("float                    int");
        System.out.println("-----------------------------");

        float x= 0.0F;
        for(int i =0; i<=1000; i++, x +=0.001F)
            System.out.printf("%9.7f  %9.7f\n", x, (float)i /1000);
    }
}
