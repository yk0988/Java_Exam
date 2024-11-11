package Test03;

class Account {
    private String name; // 예금주 이름
    private String no; // 계좌 번호
    private long balance; // 일반 예금 잔액

    // 생성자
    public Account(String name, String no, long balance) {
        this.name = name;
        this.no = no;
        this.balance = balance;
    }

    // 예금 메서드
    public void deposit(long amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // 잔액 확인 메서드
    public long getBalance() {
        return balance;
    }
}