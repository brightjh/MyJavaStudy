package top.bright.test2;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小青",1);
        f.eat();
        f.swimming();

        System.out.println("================================");

        Dog d = new Dog("大黄",3);
        d.eat();
        d.swimming();

        System.out.println("================================");


        Rabbit r = new Rabbit("小白",2);
        r.eat();
    }
}
