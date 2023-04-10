package extendsTest2;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001", "zhangsan", 10000, 5000);
        System.out.println(m.getID() + "," + m.getName() + "," + m.getSalary() + "," + m.getBouns());
        m.work();
        m.eat();

        System.out.println("=============");

        Accident a = new Accident("002","lisi",10000);
        System.out.println(a.getID() + "," + a.getName() + "," + a.getSalary());
        a.work();
        a.eat();
    }
}
