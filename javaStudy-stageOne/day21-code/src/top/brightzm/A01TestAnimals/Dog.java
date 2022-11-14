package top.brightzm.A01TestAnimals;

public abstract class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public abstract void eating();
}
