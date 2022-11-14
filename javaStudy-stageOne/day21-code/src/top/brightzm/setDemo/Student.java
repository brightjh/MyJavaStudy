package top.brightzm.setDemo;

public class Student implements Comparable<Student> {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    //this:表示当前要添加的元素
    // o:表示已经在红黑树中存在的元素

    // 返回值：
    // 负数：表示当前要添加的元素小于存在的元素，添加到左边
    // 正数则相反
    // 0 则表示当前元素已经存在，丢弃


    public int compareTo(Student o) {
        // 指定排序的规则
        System.out.println("---------------");
        System.out.println("this: "+ this);
        System.out.println("o: "+ o);

        // 只看年龄，按升序进行排列
        return this.getAge() - o.getAge();
    }


    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/


}
