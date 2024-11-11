package Test03;

class AccountCompare {
    // 계좌 비교 메서드
    public static int compBalance(Account a, Account b) {
        long totalBalanceA = a instanceof TimeAccount
                ? ((TimeAccount)a).getBalance() + ((TimeAccount)a).getTimeBalance()
                : a.getBalance();

        long totalBalanceB = b instanceof TimeAccount
                ? ((TimeAccount)b).getBalance() + ((TimeAccount)b).getTimeBalance()
                : b.getBalance();

        if (totalBalanceA > totalBalanceB) {
            return 1; // a가 많으면
        } else if (totalBalanceA < totalBalanceB) {
            return -1; // b가 많으면
        } else {
            return 0; // a와 b가 같다
        }
    }

    public static void main(String[] args) {
        Account gildong = new Account("길동", "123456", 500);
        TimeAccount chulsu = new TimeAccount("철수", "654321", 300, 400);

        System.out.println("길동이와 철수의 예금 잔액 비교 결과입니다.");
        switch (compBalance(gildong, chulsu)) {
            case 0:
                System.out.println("두 사람의 예금 잔액은 같습니다.");
                break;
            case 1:
                System.out.println("길동이의 예금 잔액이 많습니다.");
                break;
            case -1:
                System.out.println("철수의 예금 잔액이 많습니다.");
                break;
        }
    }
}
