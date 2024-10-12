import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Scanner stdIn=new Scanner(System.in);
        int n;
        do{
            System.out.println("양의 정수값:");
            n=stdIn.nextInt();
        } while (n<=0);

            int factorial=1;
            int i = 1;

            while(i<=n) {
                factorial *=i; //factorial x 1
                i++;        //+i증가
            }
        System.out.println("1부터 "+n+ "n까지 곱은"+ factorial+"입니다.");
    }
}
