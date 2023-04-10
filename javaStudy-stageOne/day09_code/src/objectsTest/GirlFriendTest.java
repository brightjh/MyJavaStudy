package objectsTest;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend girlFriend1 = new GirlFriend("SYN",20,'女',"学习");
        GirlFriend girlFriend2 = new GirlFriend("Future",25,'女',"工作");
        GirlFriend girlFriend3 = new GirlFriend("NO",19,'女',null);
        GirlFriend girlFriend4 = new GirlFriend("PEOPLE",18,'女',null);
        GirlFriend[] array = {girlFriend1,girlFriend2,girlFriend3,girlFriend4};
        int sumAge = 0;
        for (int i = 0; i < array.length; i++) {
            sumAge += array[i].getAge();
        }
        int avgAge = sumAge / array.length;
        System.out.println(avgAge);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].getAge()>avgAge){
                System.out.println(array[i].getName()+","+array[i].getAge()+","+array[i].getGender()+","+array[i].getHobby());
                count++;
            }
        }
        System.out.println (count+"个");


    }
}
