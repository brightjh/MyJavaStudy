package extendDemo;

public class test {
    public static void main(String[] args) {
        HaShiQiDog hsd = new HaShiQiDog();
        Animals.eat();
        hsd.breakHouse();

        System.out.println("--------------");
        LiHuaCat lc = new LiHuaCat();
        lc.eat();
        lc.catchMice();

    }


}
