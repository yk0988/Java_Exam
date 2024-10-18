package Exam08;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        System.out.println("요소 수:");
        int n =stdIn.nextInt();
        double[] a= new double[n]; //숫자를 저장하는 배열

    for(int j=0; j<n; j++){
        System.out.print("a["+j+"]=");
        a[j]= stdIn.nextDouble();

    }

double sum= 0;
for(double i: a)
    sum +=i;

    System.out.println("요소의 합은 ["+sum+"] 입니다.");
    System.out.println("요소의 평균은 ["+sum/n+"] 입니다.");
    }
}
