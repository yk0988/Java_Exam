package Exam11;

import java.util.Scanner;

public class Test04 {
    static int minOf(int[]a){
        int min=a[0];
        for(int i=1; i< a.length; i++)
            if(a[i]<min)
                min=a[i];
        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("사람 수는 :");
        int num = stdIn.nextInt(); //인간카운트//

        int[] height = new int[num]; //신장//
        int[] weight = new int[num]; //무게//

        System.out.println(num+"명의 신장과 체중을 입력하자.");
        for (int i=0; i<num; i++){
            System.out.println((i+1)+"번의 신장");
            height[i]=stdIn.nextInt();
            System.out.println((i+1)+"번의 체중");
            weight[i]=stdIn.nextInt();
        }
        System.out.println("가장 키가 작은 사람의 신장: "+minOf(height)+"cm");
        System.out.println("가장 마른 사람의 체중: "+minOf(weight)+"kg");
    }
}


