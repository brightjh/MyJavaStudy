package objectsDemo;

public class GirlFriend {
    private String name;
    private int age;
    private int height;
    private int weight;

    public GirlFriend(){ // 空参的构造方法
        this.name = null;
        this.age = 0;
        this.height = 0;
        this.weight = 0;
    }

    public GirlFriend(String name, int age,int height,int weight){
        this.name = name;      // 带参的构造方法
        this.age = age;
        this.height = height;
        this.weight = weight;

    }


    public void setName(String name){
//        使用this指代成员变量
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        if (age>=18 && age<=30){
            this.age = age;
        }else {
            System.out.println("数据错误");
        }
    }

    public int getAge(){
        return age;
    }

    public void setHeight(int height){
//        使用this指代成员变量
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }


    public void introduction(){
        System.out.println("我叫"+name+",");
        System.out.println("今年"+age+"岁了,");
        System.out.println("身高"+height+",");
        System.out.println("体重"+weight+"公斤,");
        System.out.println("我喜欢你");


    }

    public void chat(){
        System.out.println("和你聊天");
    }
    public void hug(){
        System.out.println("和你拥抱");
    }




}
