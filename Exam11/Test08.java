import java.util.Scanner;
public class Test08 {
    static void aryIns(int[] a,int idx,int x){
        if(idx>0 && idx<a.length){
            for (int i=a.length-1; i>idx; i--)
                a[i]=a[i-1];
            a[idx]=x;
        }
    }

    /* if (idx >= 0 && idx < a.length) 조건문은 배열 인덱스가 유효한지 확인하는 조건.
    즉, idx가 0 이상이고 a.length보다 작은 범위일 때만 배열에 값을 삽입함.
    따라서 a.length는 배열의 크기를 나타내며, 배열을 다룰 때 인덱스의 범위를 제한하거나
    배열의 끝을 계산하는 데 사용함.*/

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소 수 : ");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for(int i=0; i<num; i++){
            System.out.println("a["+i+"]:");
            a[i]= stdIn.nextInt();
        }

        System.out.println("삽입할 요소의 인덱스");
        int idx = stdIn.nextInt();

        System.out.println("삽입할 값");
        int n = stdIn.nextInt();

        aryIns(a,idx,n);  //배열 a에서 a[idx]에 x를 삽입//

        for (int i=0; i<num; i++)
        System.out.println(" a[" + i +"]="+a[i]);
    }
}


        /*
        idx: 배열 a에서 삽입할 위치의 인덱스임.
        사용자가 입력한 위치에 새로운 값을 삽입함으로 즉, a[idx]: 이 위치에 값 x를 삽입하려고 함.

        예) 요소수:6 인덱스:2 값: 99
        a[0]=1 a[1]=3 a[2]=99 a[3]=7 a[5]=9
        */
