import java.util.Scanner;
//표준체중=(신장-100)*0.9//

public class Test07 {
    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);
        System.out.println("몇 cm부터");
        int hmin= stdIn.nextInt();

        System.out.println("몇 cm까지");
        int hmax= stdIn.nextInt();

        System.out.println("몇 cm단위");
        int step= stdIn.nextInt();

        System.out.println("신장 표준 체중");
        System.out.println("-----");

        for (int i=hmin; i<=hmax; i+=step)
            System.out.println(i+""+0.9*(i-100));

    }
}
