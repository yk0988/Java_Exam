package Exam08;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner stdIn =new Scanner(System.in);

        System.out.println("요소 수:");
        int n =stdIn.nextInt();
        int[] a= new int[n]; //숫자를 저장하는 배열

    for(int i=0; i<n; i++)
        a[i]=1+ rand.nextInt(10);

    for(int i=0; i< n; i++)
            System.out.println("a["+i+"]="+ a[i]);

    }
}
