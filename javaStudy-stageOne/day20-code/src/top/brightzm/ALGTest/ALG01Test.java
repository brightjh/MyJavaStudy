package top.brightzm.ALGTest;

import java.util.Arrays;

public class ALG01Test {
    public static void main(String[] args) {
        // 定义数组并存储一些女朋友对象，利用Arrays的sort方法进行排序
        // 姓名，年龄，身高
        // 按照年龄大小排序，年龄一样，按照升高排序，升高一样按照姓名的首字母进行排序

        A01GirlFriend girlFriend1 = new A01GirlFriend("shui", 23, 1.73);
        A01GirlFriend girlFriend2 = new A01GirlFriend("naer", 22, 1.74);
        A01GirlFriend girlFriend3 = new A01GirlFriend("zaina", 21, 1.72);
        A01GirlFriend girlFriend4 = new A01GirlFriend("meiyou", 21, 1.75);
        A01GirlFriend girlFriend5 = new A01GirlFriend("meile", 22, 1.74);

        A01GirlFriend[] girlFriends = {girlFriend1, girlFriend2, girlFriend3, girlFriend4, girlFriend5};

        Arrays.sort(girlFriends, (o1, o2) -> {
            /*if (o1.getAge() != o2.getAge()) {
                return o1.age - o2.getAge();
            }
            if (o1.getHeight() != o2.getHeight()) {
                return o1.getHeight() - o2.getHeight();
            }
            return o1.getName().charAt(0) - o2.getName().charAt(0);*/

            double temp = o1.getAge() - o2.getAge();

            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;

            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

            if (temp >0){
                return 1;
            } else if (temp<0) {
                return -1;
            }else {
                return 0;
            }

        });

        System.out.println(Arrays.toString(girlFriends));


    }
}

