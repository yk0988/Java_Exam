package Exam11;

import java.util.Scanner;

public class Test03 {

    static int sumOf(int[]a){
        int sum = 0;
        for (int i=0; i <a.length; i++)
            sum +=a[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소 수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i=0; i< num; i++){
            System.out.println("x["+i+"]:");
            x[i]= stdIn.nextInt();
        }
        System.out.println("모든 요소의 합은"+sumOf(x)+"입니다.");
    }
}

