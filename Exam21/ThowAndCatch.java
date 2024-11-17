package Exam21;

import java.util.Scanner;

public class ThowAndCatch {
    static void check(int sw) throws Exception {

        switch (sw) {
            case 1:
                throw new Exception("검사예외 발생!");
            case 2:
                throw new RuntimeException("비검사예외 발생!");
        }
    }

    static void test(int sw) throws Exception {
        check(sw);
    }

    public static void main(String[]agrs){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("sw");
        int sw = stdIn.nextInt();
        try {
            test(sw);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
      }
    }
