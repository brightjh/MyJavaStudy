package arrayLIstTest;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<Phone> phoneList = new ArrayList<>();

        Phone phone1 = new Phone("小米",1000);
        Phone phone2 = new Phone("苹果",8000);
        Phone phone3 = new Phone("锤子",2999);

        phoneList.add(phone1);
        phoneList.add(phone2);
        phoneList.add(phone3);


        ArrayList<Phone> getPhone = getPhone(3000,phoneList);
        for (int i = 0; i < getPhone.size(); i++) {
            System.out.println("品牌为:"+getPhone.get(i).getBrand()+",价格为:"+getPhone.get(i).getPrice());
        }

    }

    public static ArrayList<Phone> getPhone(double price, ArrayList<Phone> phones){
        ArrayList<Phone> getPhone = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice()<=price) {
                getPhone.add(phones.get(i));
            }

        }
        return getPhone;
    }

}
