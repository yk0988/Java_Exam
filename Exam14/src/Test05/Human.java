package Test05;

class Human {
    private static int counter = 0; // 생성된 사람 수를 세는 정적 변수
    private String name; // 이름
    private int height; // 신장
    private int weight; // 체중
    private int id;     // 고유 식별 번호

    // 생성자
    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        id = ++counter; //  1 생성될 때마다 id 값 증가
    }

    // getter 메소드
    public String getName() {
        return name;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }

    // setter 메소드 (체중 변경)
    public void gainWeight(int w) {
        weight += w;
    }
    public void reduceWeight(int w) {
        weight -= w;
    }

    // id 가져오기 메소드
    public int getId() {
        return id;
    }

    // 정보 출력 메소드
    public void putData() {
        System.out.println("이름: " + name);
        System.out.println("신장: " + height + "cm");
        System.out.println("체중: " + weight + "kg");
    }
}


