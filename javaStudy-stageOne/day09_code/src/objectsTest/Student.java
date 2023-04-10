package objectsTest;

public class Student {
    private int stuID;
    private String name;
    private int age;


    public Student(int stuID, String name, int age) {
        this.stuID = stuID;
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
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
}
