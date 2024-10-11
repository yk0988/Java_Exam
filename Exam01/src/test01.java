//키보드로 입력한 값을 음수로 판별//

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수:");
        int n= stdIn.nextInt();

        if(n<0)
            System.out.println("이 값은 음의 값");


    }

}
