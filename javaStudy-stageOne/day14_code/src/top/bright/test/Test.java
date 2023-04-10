package top.bright.test;

public class Test {
    public static void main(String[] args) {
        // 创建羊的对象
        Sheep s = new Sheep("肖恩",5);
        s.eat();
        s.drink();

        // 创建狗的对象
        Dog d = new Dog("大黄",3);
        d.eat();
        d.drink();

        // 创建青蛙的对象
        Frog f = new Frog("跳跳",1);
        f.eat();
        f.drink();

    }
}
