package Bank;

class Account {
    private static int counter = 0; // 계좌 식별 번호를 부여했는가
    private String name; // 계좌 명의
    private String no; // 계좌 번호
    private long balance; // 예금 잔액
    private Day openDay; // 계좌 개설일
    private int id; // 식별 번호

    // 인스턴스 초기화 블록
    {
        id = ++counter; // 식별 번호 증가
        System.out.println("은행 계좌를 개설해주셔서 감사합니다.");
    }

    // 생성자 (예금액은 0이고 계좌 개설일은 오늘)
    public Account(String name, String no) {
        this(name, no, 0, new Day());
    }

    // 생성자
    public Account(String name, String no, long balance, Day openDay) {
        this.name = name; // 계좌 명의
        this.no = no; // 계좌 번호
        this.balance = balance; // 예금 잔액
        this.openDay = new Day(openDay); // 계좌 개설일
    }

    // 계좌 명의 얻기
    public String getName() {
        return name;
    }

    // 계좌 번호 얻기
    public String getNo() {
        return no;
    }

    // 예금 잔고 얻기
    public long getBalance() {
        return balance;
    }

        // 계좌의 식별 번호 가져오기
        public int getId() {
            return id;
        }

        // 계좌 개설일 확인
        public Day getOpenDay() {
            return new Day(openDay); // Day 클래스를 이용하여 새로운 객체 생성
        }

        // k원 입금
        public void deposit(long k) {
            balance += k;
        }

        // k원 출금
        public void withdraw(long k) {
            balance -= k;
        }

        // 문자열 표현을 이용한 계좌 기본 정보 반환
        public String toString() {
            return "계좌 정보: [" + name + ", " + no + ", " + balance + "]";
        }
    }