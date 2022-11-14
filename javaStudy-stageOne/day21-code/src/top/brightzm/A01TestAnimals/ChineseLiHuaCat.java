package top.brightzm.A01TestAnimals;

public class ChineseLiHuaCat extends Cat{
    public ChineseLiHuaCat() {
    }

    public ChineseLiHuaCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的狸花猫，正在吃鱼");
    }
}
