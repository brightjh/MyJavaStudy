package top.bright.test3;

public class BasketballPlayer extends Sportsman {

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学打篮球");
    }
}
