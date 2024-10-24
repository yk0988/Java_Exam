import java.util.Scanner;

public class Test07 {
    //배열 a에서 a[idx]삭제 후 뒤에 있는 요소들을 한칸씩 앞으로 이동//
    static void aryRmv(int[] a,int idx,int n){
        if(idx>0 && idx<a.length){
            int idx2 = idx + n - 1;
            if (idx2 > a.length - n - 1)
            idx2 = a.length - n - 1;
            for (int i=idx;i< a.length-1; i++)
                a[i] = a[i+1];
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요소 수 : ");
        int num = stdIn.nextInt();
        int[] a = new int[num];


        for(int i=0; i<num; i++){
            System.out.println("a["+i+"]:");
            a[i]= stdIn.nextInt();
        }

        System.out.println("삭제할 요소의 인덱스");
        int idx = stdIn.nextInt();

        System.out.println("삭제할 요소의 수");
        int n = stdIn.nextInt();

        aryRmv(a,idx,n);
        for (int i=0; i<num; i++)
            System.out.println(" a[" + i +"]="+a[i]);
    }
}
