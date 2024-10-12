import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        System.out.println();
       int n= stdIn.nextInt();
        if (n>0) {
            for (int i=0; i<n/5; i++)
                System.out.println("*****");
            int rest= n % 5;
                if (rest>0){
                    for (int i=0; i<rest; i++)
                        System.out.println("*");
                    System.out.println();

                }

        }
    }
}
