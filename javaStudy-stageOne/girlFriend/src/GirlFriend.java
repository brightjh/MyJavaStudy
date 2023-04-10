public class GirlFriend {
    private String name;
    private int age;
    private int heightCM;
    private int weightKG;
    private int heartbeat;

    public void about(){
        System.out.println("姓名: "+this.name);
        System.out.println("年龄: "+this.age);
        System.out.println("身高: "+this.heightCM +"厘米");
        System.out.println("体重: "+this.weightKG+"公斤");
        System.out.println("心动指数: "+this.heartbeat);


    }

    public GirlFriend() {

    }

    public GirlFriend(String name, int age, int heightM, int weightKG, int heartbeat) {
        this.name = name;
        this.age = age;
        this.heightCM = heightM;
        this.weightKG = weightKG;
        this.heartbeat = heartbeat;
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

    public int getHeightCM() {
        return heightCM;
    }

    public void setHeightCM(int heightCM) {
        this.heightCM = heightCM;
    }

    public int getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(int weightKG) {
        this.weightKG = weightKG;
    }

    public int getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(int heartbeat) {
        this.heartbeat = heartbeat;
    }
}
