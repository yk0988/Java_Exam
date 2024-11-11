package Animai2.Animai;

class Cat extends Animal {
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;

    }

    public void bark() {
        System.out.println("어흥");
    }

    @Override
    public String toString() {
        return age + "살 먹은" + getName();
    }
}
