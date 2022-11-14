package top.bright.test;

public class Sheep extends Animals{

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("羊正在吃草");
    }
}
