import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("변수 a:"); int a =stdIn.nextInt();
        System.out.println("변수 b:"); int b =stdIn.nextInt();

        if (a>b)
            System.out.println("a가 큼");
        else if (a<b)
            System.out.println("b가 큼");
         else
          System.out.println("a와 b가 같다");


    }
}
