package Players;

class DVDPlayerTester {
    public static void main(String[] args) {
        DVDPlayer a = new DVDPlayer();
        Players b = new DVDPlayer();
        ExPlayer c = new DVDPlayer();

        System.out.println("DVDPlayer형 변수 a");
        a.play(); // 재생
        a.stop(); // 정지
        a.slow(); // 느린 재생

        System.out.println("Player형 변수 b");
        b.play(); // 재생
        b.stop(); // 정지

        System.out.println("ExPlayer형 변수 c");
        c.play(); // 재생
        c.stop(); // 정지
        c.slow(); // 느린 재생
    }
}