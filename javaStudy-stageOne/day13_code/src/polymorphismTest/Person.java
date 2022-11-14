package polymorphismTest;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void keepPet(Animal pet, String something){
        if (pet instanceof Dog dog) {
            System.out.println("年龄为"+this.age+"岁的"+this.name+"养了一只"+dog.getColor()+"颜色的狗");
            dog.eat(something);
        } else if (pet instanceof Cat cat) {
            System.out.println("年龄"+this.age+"岁的"+this.name+"养了一只"+cat.getColor()+"颜色的猫");
            cat.eat(something);
        }else {
            System.out.println("没有这个宠物");
        }

    }
}
