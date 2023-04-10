package top.bright.test2;

public class Frog extends Animals implements Swimming{

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swimming() {
        System.out.println("青蛙正在蛙泳");
    }

    @Override
    public void eat() {
        System.out.println("青蛙正在吃虫子");
    }


}
