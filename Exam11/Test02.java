import java.util.Scanner;
public class Test02 {

//메소드는 **정수 x**를 32비트 이진수로 출력>>>
// 연산자는 논리적 오른쪽 시프트로, 부호 비트와 관계없이 비트를 오른쪽으로 이동.
// & 1을 통해 각 비트가 1인지 0인지 판별하고 출력.

static void printBits(int x){
    for(int i=31; i>=0; i--)
    System.out.println(((x >>> i & 1)==1)?'1':0);
}

//>>> 연산자는 논리적 오른쪽 시프트로, 부호 비트와 관계없이 비트가 오른쪽으로 이동

//x의 pos위치에 있는 비트로부터 n개 비트를 1로 변경한 값을 반환//
static int setN ( int x, int pos, int n){
    return x | (~(~0 << n) << pos);
}

//x의 pos위치에 있는 비트로부터 n개 비트를 0로 변경한 값을 반환//
static int resetN ( int x, int pos, int n){
    return x & (~(~0 << n) << pos);
}

//x의 pos위치에 있는 비트로부터 n개 비트를 반전한 값을 반환//
static int inveresetN ( int x, int pos, int n){
    return x ^ (~(~0 << n) << pos);
}


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수x와 pos번째 비트로 부터 n개 비트를 변경합니다.");
        System.out.println("x :"); int x = stdIn.nextInt();
        System.out.println("pos :"); int pos = stdIn.nextInt();
        System.out.println("n :"); int n = stdIn.nextInt();
        System.out.println("x     ="); printBits(x);
        System.out.println("\nsetN(x,pos,n)     ="); printBits(setN(x,pos,n));
        System.out.println("\nresetN(x,pos,n)     ="); printBits(setN(x,pos,n));
        System.out.println("\ninveresetN(x,pos,n)     ="); printBits(inveresetN(x,pos,n));
        System.out.println();
    }
}

/*  이 프로그램은 사용자로부터 입력받은 정수 x에 대해 주어진 위치에서부터
    n개의 비트를 변경하는 여러 가지 기능을 제공함.
    setN으로 비트를 1로 설정하고, resetN으로 비트를 0으로 설정하며,
    inveresetN으로 비트를 반전시킴.
    각 연산의 결과는 32비트 이진수 형식으로 출력.*/
