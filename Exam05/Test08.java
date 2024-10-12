import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);
        System.out.println("정수를 더해보아요.");
        System.out.println("몇 개를 더할까요?");
        int n= stdIn.nextInt(); //개수의 정수//
        int sum = 0;
        int i;
        for (i=0; i<n; i++){
            System.out.println("정수(0으로 종료)");
            int t = stdIn.nextInt();
            if (t==0)break; //for문을 나간다//
            sum += t;
        }
        System.out.println("합계는"+ sum +"입니다");
        if(i !=0)
            System.out.println("평균은"+sum/i+"입니다");
    }
}
