package pet;

    public class SkinnableRobotPetTester {
        // p가 참조하는 인스턴스에 자기 소개를 시킨다
        static void intro(Pet p) {
            p.introduce();
        }

            public static void main(String[] args) {
                Pet[] a = {
                        new Pet("Kurt", "아이"),
                        new RobotPet("R2D2", "루크"),
                        new SkinnableRobotPet("DSX5", "Apple", Skinnable.YELLOW),
                        new Pet("맛동산", "고양이")
                };

                for (Pet p : a) {
                    intro(p); // p가 참조하는 인스턴스에 자기 소개를 시킨다
                    // p의 참조 대상이 SkinnableRobotPet이라면...
                    if (p instanceof SkinnableRobotPet) {
                        System.out.print("색상은 ");

                        ((SkinnableRobotPet)p).printSkin();
                        System.out.println("입니다.");
                    }
                    System.out.println();
                }
            }
        }
