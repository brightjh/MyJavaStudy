package top.brightzm.setDemo;

public class A02HashSetDemo {
    public static void main(String[] args) {
        // 1.创建对象
        Student s1 = new Student("张三",20);
        Student s2 = new Student("张三",20);

        // 2.如果没有重写hashCode方法，计算出的hash值是不同的
        // 重写hashCode方法，计算的hash值就是相同的
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());




    }

}
