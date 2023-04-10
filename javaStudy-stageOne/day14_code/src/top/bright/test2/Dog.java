package top.bright.test2;

public class Dog extends Animals implements Swimming {


    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swimming() {
        System.out.println("狗正在狗刨");
    }

    @Override
    public void eat() {
        System.out.println("狗正在吃骨头");
    }
}
