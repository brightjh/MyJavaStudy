package top.brightzm.ObjectDemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        // 返回对象的字符串形式
        Student stu = new Student("bright",20);
        System.out.println(stu.toString());

        // 默认返回地址值
       // 如果想要通过toString查看属性值 需要重写toString方法 返回属性值


        // equals对比是否相同
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("张三",23);
        Student stu3 = new Student("李四",24);

        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.equals(stu3));
        // 默认比较地址值
        // 同样可以进行重写



    }
}
