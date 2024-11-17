import java.util.Scanner;

class PrintStringArray {

    // 문자열 배열을 한 줄씩 출력하는 메서드
    static void printStringArray(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열의 개수: ");
        int count = scanner.nextInt();

        String[] strings = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("문자열" + (i + 1) + ": ");
            strings[i] = scanner.next();
        }

        printStringArray(strings);
    }
}