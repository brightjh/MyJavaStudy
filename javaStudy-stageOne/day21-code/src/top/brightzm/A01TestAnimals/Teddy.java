package top.brightzm.A01TestAnimals;

public class Teddy extends Dog{
    public Teddy() {
    }

    public Teddy(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
