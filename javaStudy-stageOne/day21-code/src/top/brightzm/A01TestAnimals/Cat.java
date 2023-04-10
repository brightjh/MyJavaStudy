package top.brightzm.A01TestAnimals;

public abstract class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public abstract void eating();
}
