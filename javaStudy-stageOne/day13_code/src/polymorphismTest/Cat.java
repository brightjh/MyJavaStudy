package polymorphismTest;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
//        3岁的灰颜色的猫眯着眼睛侧着头吃鱼
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫眯着眼睛吃"+something);
    }

    public void catchMouse(){
        System.out.println("猫正在抓老鼠");
    }
}
