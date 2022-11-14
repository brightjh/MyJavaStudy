package objectsDemo;

public class PhoneTest {
    public static void main(String[] args) {
        // 创建对象
        Phone p = new Phone();

        // 给对象中的成员变量赋值
        p.brand = "HUAWEI";
        p.price = 3999;

        // 调用对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        // 调用对象中的方法
        p.call();
        p.network();
    }

}
