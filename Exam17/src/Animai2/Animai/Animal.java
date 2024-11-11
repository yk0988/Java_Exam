package Animai2.Animai;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void bark();

    public String getName() {
        return name;
    }

    public abstract String toString();

    public void inturoduce(){

        System.out.print(toString()+" 이다.");
        bark();
    }
}
