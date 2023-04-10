package objectsTest;

public class CommodityTest {
    public static void main(String[] args) {
        Commodity computer = new Commodity(1,"电脑",14999,999);
        Commodity phone = new Commodity(2,"手机",3999,9999);
        Commodity watch = new Commodity(3,"手表",1999,299);

        Commodity[] electronic = {computer,phone,watch};

        for (int i = 0; i < electronic.length; i++) {
            System.out.println(electronic[i].getId()+","+electronic[i].getName()+","+electronic[i].getPrice()+","+electronic[i].getCount());
        }
    }
}
