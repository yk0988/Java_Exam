import java.util.Scanner;
//월을 1~12 정수값으로 읽어서 해당하는 계절을 표시하는 프로그램을 작성하자.//
public class Test10 {
    public static void main(String[] args) {

        Scanner stdIn=new Scanner(System.in);

        System.out.println("몇 월 입니까");
        int month = stdIn.nextInt();
        
        switch (month){
            case 3:
            case 4:
            case 5: System.out.println("봄"); break;
            case 6:
            case 7:
            case 8: System.out.println("여름"); break;
            case 9:
            case 10:
            case 11: System.out.println("가을"); break;
            case 12:
            case 1:
            case 2: System.out.println("겨울"); break;
            default: System.out.println("없는데용"); break;
                
        }
    }
}