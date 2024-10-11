import java.util.Scanner;


public class eee {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        System.out.print("1: 콜라, 2: 사이다, 3: 환타, 4: 오렌지주스, 5: 포도주스 ");
        int beverageNum = stdin.nextInt();

        if(beverageNum == 1)
            System.out.println("콜라가 나왔습니다!");
        else if(beverageNum == 2)
            System.out.println("사이다가 나왔습니다!");
        else if(beverageNum == 3)
            System.out.println("판타가 나왔습니다!");
        else if(beverageNum == 4)
            System.out.println("오렌지 주스가 나왔습니다!");
        else if(beverageNum == 5)
            System.out.println("포도 주스가 나왔습니다!");
        else
            System.out.println("버튼이 눌려지지 않았습니다.");
    }
}
