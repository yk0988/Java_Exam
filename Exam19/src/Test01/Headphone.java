package Test01;

public class Headphone implements Wearable {
    int volume = 0; // 볼륨 초기화

    public void putOn() {
        System.out.println("헤드폰을 착용했습니다.");
    }

    public void putOff() {
        System.out.println("헤드폰을 벗었습니다.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("볼륨을 " + volume + "으로 변경했습니다.");
    }
}
