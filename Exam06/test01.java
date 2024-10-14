import java.util.Scanner;
//5개의 정수로 구성된 그룹의 전체 합계를 구해보자!/
// * 99999를 입력하면 전체 입력을 종료
// * 88888을 입력하면 현재 읽고 있는 그룹의 입력을 종료
public class test01 {
    public static void main(String[] args) {
        Scanner stdIn =new Scanner(System.in);

        System.out.println("정수를 더합니다.");
        int total = 0;
//전체 그룹의 합계//


        Outer:
        for(int i = 1; i<=10; i ++) {
            System.out.println(i +"그룹");


            for (int j= 0; j<5; j++){
                System.out.println();
                int t=stdIn.nextInt();
                if (t==9999)
                    //1//
                  break Outer;
                else if(t==8888)
                    //2//
                    continue Outer;
                total += t;
            }


        }//1 번 >>출력//
        System.out.println("/n합계는 "+total+"입니다.");
    }
}
