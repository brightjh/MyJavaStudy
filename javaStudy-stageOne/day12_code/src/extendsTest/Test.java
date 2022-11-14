package extendsTest;

public class Test {
    public static void main(String[] args) {
        Husky h= new Husky();
        h.breakHouse();
        h.eat();
        h.drink();

        System.out.println("--------------");

        SharPei sp = new SharPei();
        sp.eat();
        sp.drink();

        System.out.println("-----------------");

        ChineseDog cd = new ChineseDog();
        cd.eat();
        cd.drink();

    }
}
