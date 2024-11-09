package Test01;

public class IdTester {
    public static void main(String[] args) {

        class Id {
            private static int counter = 0; // 생성된 객체의 수를 세는 정적 변수
            private int id; // 각 객체의 고유 번호

            // 생성자
            public Id() {
                id = ++counter; // 생성될 때마다 counter를 증가시켜 id에 할당
            }

            // id 값을 반환하는 메소드
            public int getId() {
                return id;
            }
        }

        Id a = new Id(); // 첫 번째 객체 생성
        Id b = new Id(); // 두 번째 객체 생성

        System.out.println("a의 식별 번호: " + a.getId());
        System.out.println("b의 식별 번호: " + b.getId());

        System.out.println("Id.counter = " + Id.counter); // 전체 객체 수 출력
         System.out.println("a.counter = " + a.counter); // 에러 발생
         System.out.println("b.counter = " + b.counter); // 에러 발생
    }
}