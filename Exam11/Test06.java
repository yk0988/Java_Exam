import java.util.Scanner;

public class Test06 {
    //배열 a에서 a[idx]삭제 후 뒤에 있는 요소들을 한칸씩 앞으로 이동//
    static void aryRmv(int[] a,int idx){
        if(idx>0 && idx<a.length){
            for (int i=idx;i< a.length-1; i++)
                a[i] = a[i+1];
        }
    }
    //a[i] = a[i+1];배열에서 요소를 왼쪽으로 한 칸씩 밀기
    //인덱스 i의 값을 i + 1 인덱스 값으로 덮어쓰는 작업
    //배열에서 요소를 삭제하고, 삭제된 자리 이후의 모든 요소를 왼쪽으로 당김.

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

        aryRmv(a,idx);                                    //배열 a에서 a[idx]를 삭제
        for (int i=0; i<num; i++)                         //배열 a
            System.out.println(" a[" + i +"]="+a[i]);
    }
}
