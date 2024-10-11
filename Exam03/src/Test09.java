import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        int n = stdIn.nextInt();
        if(n>0) {
            int i = 0;
            while (i < n / 2) {
                System.out.println("*+");
                i++;
            }
            if (n % 2 == 1)
                System.out.println('*');
            System.out.println();
        }
    }
}
