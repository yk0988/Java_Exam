package test03;

import java.util.Scanner;

public class Test03 {
    static int[] arrayRmvOf(int[] a, int idx,int n){
        if(n < 0 || idx < 0 || idx >a.length )
            return a.clone();
        else {
            if(idx + n > a.length)
                n = a.length-idx;
            int[]c= new int[a.length-n];
            int i=0;
            for(;i < idx; i++)
                c[i] =a[i];
            for(; i <a.length-n; i++)
                c[i]=a[i+n];
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);
        System.out.println("요소 수 : ");
        int num = stdIn.nextInt();
        int[]x= new int[num];

        for(int i=0; i<num; i++){
            System.out.println("x["+i+"]:");
            x[i]=stdIn.nextInt();
        }
        System.out.println("삭제를 시작할 인덱스");
        int idx = stdIn.nextInt();

        System.out.println("삭제할 요소의 개수");
        int n = stdIn.nextInt();

        int[]y=arrayRmvOf(x,idx,n);

        for(int i=0; i<y.length;i++)
            System.out.println("y["+i+"]="+y[i]);
    }
}
