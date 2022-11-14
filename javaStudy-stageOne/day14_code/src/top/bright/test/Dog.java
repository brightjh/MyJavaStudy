package top.bright.test;

public class Dog extends Animals{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗正在吃骨头");
    }
}
