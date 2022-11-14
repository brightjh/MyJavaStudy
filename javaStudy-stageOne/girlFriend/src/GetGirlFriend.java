public class GetGirlFriend {
    public static void main(String[] args) {

        // 创建女朋友对象
        GirlFriend myGirlFriend = new GirlFriend();

        myGirlFriend.setName(null);
        myGirlFriend.setAge(20);
        myGirlFriend.setHeightCM(170);
        myGirlFriend.setWeightKG(65);
        myGirlFriend.setHeartbeat(100);

        myGirlFriend.about();

    }
}
