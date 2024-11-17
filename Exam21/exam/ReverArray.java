package Exam21.exam;

import java.util.Scanner;

class ReverArray {
    // 배열의 요소 a[idx1]과 a[idx2]를 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열의 요소를 반대로 나열
    static void reverse(int[] a) {
        try {
            for (int i = 0; i < a.length / 2; i++) {
                swap(a, i, a.length - i );
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("reverse의 버그?", e);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try {
            System.out.print("요소 수: ");
            int num = stdIn.nextInt(); // 요소 수
            int[] x = new int[num];

             for (int i = 0; i < num; i++) {
                 System.out.print("x[" + i + "] = ");
                 x[i] = stdIn.nextInt();
             }

            reverse(x); // null 배열을 전달하여 NullPointerException 발생

            System.out.println("요소를 반대로 나열했습니다.");
            for (int i = 0; i < num; i++) {
                System.out.println("x[" + i + "] = " + x[i]);
            }
        } catch (RuntimeException e) {
            System.out.println("예외: " + e);
            System.out.println("예외의 원인: " + e.getCause());
        }
    }
}
