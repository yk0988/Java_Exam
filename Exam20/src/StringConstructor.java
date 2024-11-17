import java.util.Scanner;

class StringConstructor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        char[] c = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'}; // 문자 배열 생성
        String s1 = "ABC"; // 문자열 리터럴로 초기화
        String s2 = new String(); // 빈 문자열 생성
        String s3 = new String(c); // 문자 배열을 이용한 문자열 생성
        String s4 = new String(c, 5, 3); // 문자 배열의 일부를 이용한 문자열 생성
        String s5 = new String("XYZ"); // 다른 문자열을 이용한 문자열 생성
        System.out.print("문자열: ");
        String s6 = stdIn.next(); // 사용자 입력 받기

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);
    }
}