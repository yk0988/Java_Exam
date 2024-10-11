import java.util.Scanner;
//3개의 정수 중 중앙값 구하기//
public class Test05 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수a:"); int a = stdIn.nextInt();
        System.out.println("정수b:"); int b = stdIn.nextInt();

        if(a==b)
            System.out.println("두 값이 같습니다.");
        else{
            int min,max;
            if(a<b){
                min=a;
                max=b;
            }else{
                min=a;
                max=b;
            }
            System.out.println("작은 값은 "+min+"입니다.");
            System.out.println("큰 값은 "+max+"입니다.");
        }
    }
}
