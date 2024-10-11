import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner stidIn = new Scanner(System.in);
        int retry;//다시 한번
        do {
            System.out.println("정수값:");
        int n = stidIn.nextInt();

        if(n>0)
            System.out.println("이 값은 양수 입니다.");
        else if (n<0)
            System.out.println("이 값은 음수 입니다.");
        else
            System.out.println("이 값은 0 입니다.");

        System.out.println("다시한번? 1-yes/ 0-no:");
        retry=stidIn.nextInt();
        }while (retry==1);
    }
}
