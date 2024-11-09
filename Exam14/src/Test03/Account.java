package Test03;

import Test02.Day;

class Account {
    private String name; // 계좌 명의
    private String no;   // 계좌 번호
    private long balance; // 예금 잔고
    private Day openDay; // 개설일

    // 생성자
    public Account(String name, String no, long balance, Day openDay) {
        this.name = name; // 계좌 명의
        this.no = no;     // 계좌 번호
        this.balance = balance; // 예금 잔고
        this.openDay = new Day(openDay); // Day 클래스의 복사 생성자 필요
    }

    // 계좌 명의 확인
    public String getName() {
        return name;
    }

    // 계좌 번호 확인
    public String getNo() {
        return no;
    }

    // 예금 잔고 확인
    public long getBalance() {
        return balance;
    }

    // 개설일 확인
    public Day getOpenDay() {
        return new Day(openDay); // Day 클래스의 복사 생성자 필요
    }

    // k원 입금
    public void deposit(long k) {
        if (k > 0) {
            balance += k;
        } else {
            System.out.println("입금액은 양수여야 합니다.");
        }
    }

    // k원 출금
    public void withdraw(long k) {
        if (balance >= k) {
            balance -= k;
        } else {
            System.out.println("잔고 부족");
        }
    }

    // 계좌 정보를 문자열로 반환
    @Override
    public String toString() {
        return "{이름: '" + name + "', 고유번호: '" + no + "', 잔고: " + balance + "}";
    }
}
