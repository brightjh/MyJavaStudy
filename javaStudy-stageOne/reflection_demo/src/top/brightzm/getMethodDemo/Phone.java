package top.brightzm.getMethodDemo;

public class Phone {

    private String tag;

    private int age;


    public Phone() {
    }

    public Phone(String tag) {
        this.tag = tag;
    }

    public Phone(int age) {
        this.age = age;
    }

    private Phone(String tag, int age) {
        this.tag = tag;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * 设置
     *
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Car{tag = " + tag + ", age = " + age + "}";
    }


}
