package top.brightzm.LambdaDemo;

public class A02LambdaDemo {
    public static void main(String[] args) {
        // Lambda简化内部类的书写

        // 原本的方式
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("游泳～");
            }
        });

        // lambda表达式
        // 只能用来简化匿名内部类的的书写
        // 只能简化函数式接口的匿名内部类的写法
        // 函数式接口： 有且仅有一个抽象方法的接口叫函数式接口，接口上方可以加@FunctionalInterface

        method(() -> {
            System.out.println("又在游泳～");
        });


    }

    private static void method(Swim s) {
        s.swimming();
    }


}


@FunctionalInterface
interface Swim {
    abstract void swimming();
}