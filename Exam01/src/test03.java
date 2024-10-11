//절대값//

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수값:");
        int n= stdIn.nextInt();

        int abs;
//if 조건식 실행문//
        if(n>=0)
            abs=n;
            //n이 영보다 크거나 같을때 실행//

        else
            abs=-n;
        System.out.println("절대값은"+abs+"입니다.");
    }
}
