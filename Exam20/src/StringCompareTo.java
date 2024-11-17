import java.util.Scanner;

class StringCompareTo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("문자열 s1: ");
        String s1 = stdIn.next();
        System.out.print("문자열 s2: ");
        String s2 = stdIn.next();

        int balance = s1.compareTo(s2);
        if (balance < 0) {
            System.out.println("s1이 s2보다 작다.");
        } else if (balance > 0) {
            System.out.println("s2가 s1보다 작다.");
        } else {
            System.out.println("s1과 s2가 같다.");
        }
    }
}