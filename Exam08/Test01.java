package Exam08;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner stdInd=new Scanner(System.in);

    /*    n: 사람의 수
        points[]: 각 사람의 점수를 저장할 배열
        sum: 모든 사람의 점수 합
        max: 최고 점수
        min: 최저 점수
        n은 점수를 입력받을 사람의 수
    */

    System.out.println("사람 수 :");
        int n = stdInd.nextInt();
        int[] points = new int[n];

        System.out.println("점수를 입력하세요.");
        int sum = 0;
        for (int i= 0; i < n; i++){
            System.out.println((i+1)+ " : 번 사람 점수:");
            points[i]=stdInd.nextInt();
            sum += points[i];
        }

        int max=points[0];
        int min=points[0];
        for(int i =1; i<n; i++){
            if (points[i]>max)max = points[i];
            if (points[i]<min)min = points[i];
        }
        System.out.println("합계는"+sum+"점입니다.");
        System.out.println("평균은"+(double)sum/n+"점입니다.");
        System.out.println("최고점은"+max+"점입니다.");
        System.out.println("최저점은"+min+"점입니다.");


    }
}
