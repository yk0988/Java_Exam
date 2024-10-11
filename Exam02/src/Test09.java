import java.util.Random;
//랜덤) 난수를 생성하여 랜덤으로 가위바위 보 표기.//
public class Test09  {
    public static void main(String[] args) {

        Random rand= new Random();

        System.out.println("컴퓨터가 낸 것:");
        int hand= rand.nextInt(3);
        
        switch (hand){
            case 0 :
                System.out.println("가위"); break;
            case 1 :
                System.out.println("바위"); break;
            case 2 :
                System.out.println("보"); break;
            
        }
        
    }
}
