import java.util.Scanner;
//카운트다운//
public class Test03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("카운트다운");
        int x;
            do{
                 System.out.println("양의 정수:");
                 x = stdIn.nextInt();
                }while (x <= 0);

                    for (;x>=0; x--)
                        System.out.println(x); //x값 출력
    }
}
