package Test03;

class Id {
    static int counter = 0; // 생성된 객체의 수를 세는 정적 변수
    private static int step = 1; // 식별 번호 증가폭
    private int id; // 각 객체의 고유 식별 번호

    // 생성자
    public Id() {
        id = counter += step; // 생성될 때마다 counter를 step만큼 증가시키고 id에 할당
    }

    // 식별 번호 가져오기 메소드
    public int getId() {
        return id;
    }

    // 증가폭 가져오기 메소드
    public static int getStep() {
        return step;
    }

    // 증가폭 설정 메소드
    public static int setStep(int s) {
        step = (s >= 1) ? s : 1; // 증가폭은 1 이상이어야 함
        return step;
    }

    // 마지막에 부여한 식별 번호 가져오기 메소드
    public static int getMaxId() {
        return counter;
    }
}

class ExId extends Id {
    public ExId() {
        super();
    }
}

public class IdTester {
    public static void main(String[] args) {
        ExId a = new ExId(); // 식별 번호 1번
        ExId b = new ExId(); // 식별 번호 2번
        ExId c = new ExId(); // 식별 번호 3번

        ExId.setStep(4); // 식별 번호 증가폭을 4로 설정

        ExId d = new ExId(); // 식별 번호 7번
        ExId e = new ExId(); // 식별 번호 11번
        ExId f = new ExId(); // 식별 번호 15번

        System.out.println("a의 식별 번호: " + a.getId());
        System.out.println("b의 식별 번호: " + b.getId());
        System.out.println("c의 식별 번호: " + c.getId());
        System.out.println("d의 식별 번호: " + d.getId());
        System.out.println("e의 식별 번호: " + e.getId());
        System.out.println("f의 식별 번호: " + f.getId());

        int max = ExId.getMaxId(); // 마지막으로 부여된 식별 번호 가져오기
        System.out.println("마지막에 부여한 식별 번호 = " + max);
        System.out.println("다음에 부여할 식별 번호 = " + (max + ExId.getStep()));
    }
}
