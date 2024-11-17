package Exam21;

import java.util.Scanner;

// --- 범위 밖 예외 ---
class RangeError extends RuntimeException {
    RangeError(int n) { super("범위 밖 값: " + n); }
}

// --- 범위 밖 예외 (매개변수) ---
class ParameterRangeError extends RangeError {
    ParameterRangeError(int n) { super(n); }
}

// --- 범위 밖 예외 (반환값) ---
class ResultRangeError extends RangeError {
    ResultRangeError(int n) { super(n); }
}

public class RangeErrorTest {
    // n이 1자리(0~9)인가?
    static boolean isValid(int n) {
        return n >= 0 && n <= 9;
    }

    // 1자리(0~9) 정수 a와 b의 합 구하기
    static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
        if (!isValid(a)) throw new ParameterRangeError(a);
        if (!isValid(b)) throw new ParameterRangeError(b);
        int result = a + b;
        if (!isValid(result)) throw new ResultRangeError(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = stdIn.nextInt();
        System.out.print("정수 b:");
        int b = stdIn.nextInt();

        try {
            System.out.println("합은 " + add(a, b) + "입니다.");
        } catch (ParameterRangeError e) {
            System.out.println("입력 값의 범위가 잘못되었습니다.");
        } catch (ResultRangeError e) {
            System.out.println("계산 결과가 범위를 벗어났습니다.");
        } catch (RangeError e) {
            System.out.println("범위 밖 예외가 발생\n"+e.getMessage());
        }
    }
}