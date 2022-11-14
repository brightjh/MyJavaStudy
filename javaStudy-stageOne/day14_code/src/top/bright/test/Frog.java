package top.bright.test;

public class Frog extends Animals{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙正在吃虫子");
    }
}
