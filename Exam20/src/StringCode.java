import java.util.Scanner;

class StringCode {

public static void main(String[] args) {

     Scanner stdIn = new Scanner(System.in);
     System.out.print("문자열: ");

        String s = stdIn.next();


        for (int i = 0; i < s.length(); i++) {

        System.out.printf("s[%d] = %c %X\n", i, s.charAt(i), (int)s.charAt(i));

        }

    }

}