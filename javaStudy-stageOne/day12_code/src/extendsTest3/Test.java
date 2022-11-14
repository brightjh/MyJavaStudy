package extendsTest3;

public class Test {
    public static void main(String[] args) {
        Lecturer lc = new Lecturer("001","zhangsan","讲课");
        lc.work();
        System.out.println("======================");

        Maintainer m = new Maintainer("002","lisi","维护");
        m.work();

    }


}
