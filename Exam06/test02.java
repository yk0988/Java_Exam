import java.util.Random;
import java.util.Scanner;
//숫자 맞추기 게임
//범위 0~99
//플레이어가 입력 가능한 횟수는 제한되어 있음.
public class test02 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        final int MAX_NO = 6;
        int leftNo = MAX_NO;
        int no = rand.nextInt(100);

        System.out.println(" 본격 ~숫자 맞추기 게임~ 스타트!");
        System.out.println("0부터 99사이의 숫자를 맞추세요:D");

        int x;
        do {
            System.out.println("남은횟수 " + (leftNo--) + " 회,어떤 숫자일까 ? :");
            x = stdIn.nextInt();
        if (x>no)
            System.out.println("더 작은 숫자입니다");
        else if (x<no)
            System.out.println("더 큰 숫자입니다.");
        } while( x!=no && leftNo > 0);

    if(x == no)
        System.out.println((MAX_NO - leftNo)+"회 만에 맞췄습니다." );
    else
        System.out.println("땡! 정답은 "+no+" 입니다.");
    }
}