package pet;

public class RobotPet extends Pet {
    // 생성자
    public RobotPet(String name, String masterName) {
        super(name, masterName); // 부모 클래스의 생성자 호출
    }

    // 자기 소개
    public void introduce() {
        System.out.println("아임 로봇 이름은 " + getName() + "입니다.");
        System.out.println("주인놈의 이름은 " + getMasterName() + "입니다.");
    }

    public void work(int sw) {
        switch (sw) {
            case 0: System.out.println("청소를 합니다."); break;
            case 1: System.out.println("세탁을 합니다."); break;
            case 2: System.out.println("밥을 합니다."); break;
        }
    }
}
