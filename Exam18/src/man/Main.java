package man;

public class Main {
    public static void main(String[] args) {
        Day birthday = new Day(1, 1, 2000); // 2000년 1월 1일
        Human human = new Human("홍길동", 180, 75, birthday);

        human.putData(); // 정보 출력
        System.out.println(human); // toString() 호출
    }
}
