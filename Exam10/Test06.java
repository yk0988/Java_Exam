package Exam10;

import java.util.Random;
import java.util.Scanner;

public class Test06 {
    static int random(int a, int b) {
        if (b <=a)
            return a; //b가 a보다 작거나 같으면, a를 반환. (이 경우 유효한 난수가 없으므로 하한값을 반환.)//
        else {
            Random rand = new Random();
            return a + rand.nextInt(b-a+1);
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("난수생성");
        System.out.print("하한값 : "); int min = stdIn.nextInt();
        System.out.print("상한값 : "); int max = stdIn.nextInt();

        System.out.println("생성한 난수는"+random(min,max)+"입니다.");
    }
}
