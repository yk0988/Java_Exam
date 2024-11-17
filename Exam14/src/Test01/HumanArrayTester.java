package Test01;

import java.util.Scanner;

// Human 클래스 정의
class Human {
    private String name;  // 이름
    private int height;   // 신장
    private int weight;   // 체중

    // 생성자: Human 객체를 초기화
    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // getter 메서드들: 필드 값 반환
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

public class HumanArrayTester {
    // Human 배열 출력 메서드
    static void printHumanArray(Human[] a) {
        for (int i = 0; i < a.length; i++) {
            // 각 Human 객체의 정보를 출력
            System.out.printf("No.%d %s %3dcm %3dkg\n",
                    i, a[i].getName(), a[i].getHeight(), a[i].getWeight());
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        // 1차원 배열 p 생성 및 초기화 (기본 데이터)
        Human[] p = {
                new Human("철수", 170, 70),
                new Human("길동", 160, 59),
        };

        // 배열 q의 크기 설정 및 생성 (사용자로부터 입력 받기)
        System.out.print("배열 q의 요소 수: ");
        n = stdIn.nextInt();
        Human[] q = new Human[n];

        // 배열 q의 각 요소에 대해 사용자로부터 데이터 입력받기
        for (int i = 0; i < q.length; i++) {
            System.out.print("q[" + i + "] ");
            System.out.print("이름: ");
            String name = stdIn.next();
            System.out.print("신장: ");
            int height = stdIn.nextInt();
            System.out.print("체중: ");
            int weight = stdIn.nextInt();
            q[i] = new Human(name, height, weight);  // 입력받은 값으로 Human 객체 생성
        }

        // 2차원 배열 x 생성 및 초기화 (기본 데이터)
        Human[][] x = {
                {new Human("김철수", 175, 52), new Human("김영희", 169, 60)},
                {new Human("홍길동", 178, 70), new Human("이철수", 172, 61)},
                {new Human("이영희", 168, 59), new Human("김길동", 165, 59)},
        };

        // 불규칙 배열 y 생성 (행과 열 크기를 사용자가 입력)
        System.out.print("배열 y의 행 수: ");
        n = stdIn.nextInt();  // 배열 y의 행 수 입력받기
        Human[][] y = new Human[n][];

        // 배열 y의 각 행에 대해 열 수를 입력받고, 각 요소에 데이터를 입력
        for (int i = 0; i < y.length; i++) {
            System.out.print("y[" + i + "]의 열 수: ");
            int m = stdIn.nextInt();  // 열 수 입력받기
            y[i] = new Human[m];  // 해당 행에 맞는 크기의 배열 생성
            for (int j = 0; j < y[i].length; j++) {
                System.out.println("y[" + i + "][" + j + "]");
                System.out.print("이름: ");
                String name = stdIn.next();
                System.out.print("신장: ");
                int height = stdIn.nextInt();
                System.out.print("체중: ");
                int weight = stdIn.nextInt();
                y[i][j] = new Human(name, height, weight);  // 입력받은 값으로 Human 객체 생성
            }
        }

        // 배열 p 출력
        System.out.println("배열 p");
        printHumanArray(p);

        // 배열 q 출력
        System.out.println("배열 q");
        printHumanArray(q);

        // 2차원 배열 x 출력
        System.out.println("배열 x");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%d행\n", i);  // 각 행을 구분하여 출력
            printHumanArray(x[i]);  // 해당 행에 속한 Human 배열 출력
        }

        // 불규칙 배열 y 출력
        System.out.println("배열 y");
        for (int i = 0; i < y.length; i++) {
            System.out.printf("%d행\n", i);  // 각 행을 구분하여 출력
            printHumanArray(y[i]);  // 해당 행에 속한 Human 배열 출력
        }
    }
}
