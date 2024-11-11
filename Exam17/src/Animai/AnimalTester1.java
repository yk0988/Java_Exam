package Animai;

public class AnimalTester1 {
    public static void main(String[] args) {


            Animal[] a = new Animal[2];
            a[0]=new

                    Dog("뭉치","치와왕");//개

            a[1]=new

                    Cat("마이클",2);//고양이


            for(Animal s:a){
                System.out.println(s.getName()+"");
                s.bark();
                System.out.println();
            }

    }
}
