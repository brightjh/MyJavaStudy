package polymorphismTest;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("张三",22);

        Cat c = new Cat(3,"白");

        Dog d = new Dog(2,"黑");

        p.keepPet(c,"猫条");
        System.out.println("===================");
        p.keepPet(d,"骨头");

    }
}
