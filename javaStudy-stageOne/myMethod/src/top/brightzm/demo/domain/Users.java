package top.brightzm.demo.domain;

/**
 * @description:
 * @author: bright
 * @time: 2023/4/1 下午9:51
 */
public class Users {

    private String name;

    private int age;


    public Users() {
    }

    public Users(String s) {
        this.name = s.split("-")[0];
        this.age = Integer.parseInt(s.split("-")[1]);
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
        return "Users{name = " + name + ", age = " + age + "}";
    }
}
