package staticDemo1;

public class Student {
    private String name;
    private int age;
    private String gender;

    static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // 行为
    public void study(){
        System.out.println(this.name+"正在学习");
    }

    public void show(){
        System.out.println("姓名:"+this.age+" 年龄:"+this.age+" 性别:"+this.gender+" 老师:"+ teacherName);

    }

}
