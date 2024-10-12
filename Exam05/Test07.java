import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int n;
        do{
         System.out.println("2이상의 정수 : ");
         n =stdIn.nextInt();
        }while (n<2);
        //사용자가 2 이상의 정수를 입력할 때까지 반복해서 입력을 받음
        //do-while 루프는 사용자가 입력한 값이 2보다 작은 경우 다시 입력을 요구함//

        int i;
        for (i =2; i<n; i++)
            if(n%i ==0)
                break;

        if (i == n)
            System.out.println("소수입니다");
        else
            System.out.println("소수가 아닙니다");
    }
}
