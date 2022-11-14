package objectsTest;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("HUAWEI",4999,"丹霞橙");
        Phone phone2= new Phone("APPLE",9999,"远峰蓝");
        Phone phone3 = new Phone("HONOR",3999,"魅海星蓝");
        Phone [] array = {phone1,phone2,phone3};
        double avgPrice = 0;
        double sumPrice = 0;
        int count  = array.length;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getBrand()+","+array[i].getPrice()+"."+array[i].getColor());
            sumPrice +=  array[i].getPrice();
        }
        avgPrice = sumPrice / count;
        System.out.println("平均价格为"+avgPrice);
    }
}
