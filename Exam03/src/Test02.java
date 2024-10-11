import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);
        int x;
        do {
            System.out.println("세자리의 정수 값");
            x= stdIn.nextInt();
        }while (x<100 || x>999);
        System.out.println("입력한 값은 "+x+"입니다.");

    }
}
