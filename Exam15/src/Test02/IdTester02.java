package Test02;

public class IdTester02 {

    static class Id { // 정적 내부 클래스로 변경
        private static int counter = 0; // 생성된 객체의 수를 세는 정적 변수
        private int id; // 각 객체의 고유 번호

        // 생성자
        public Id() {
            id = ++counter; // 생성될 때마다 counter를 증가시켜 id에 할당
        }

        // 식별 번호 가져오기 메소드
        public int getId() {
            return id;
        }

        // 마지막에 부여한 식별 번호 가져오기
        public static int getMaxId() {
            return counter;
        }
    }

    public static void main(String[] args) {
        Id a = new Id(); // 식별 번호 1번
        Id b = new Id(); // 식별 번호 2번

        System.out.println("a의 식별 번호: " + a.getId());
        System.out.println("b의 식별 번호: " + b.getId());

        // 정적 메소드 호출
        System.out.println("마지막으로 부여한 식별 번호 = " + Id.getMaxId());
        // 다음과 같은 호출은 필요 없음
        System.out.println("마지막으로 부여한 식별 번호 = " + a.getMaxId());
        System.out.println("마지막으로 부여한 식별 번호 = " + b.getMaxId());
    }
}
