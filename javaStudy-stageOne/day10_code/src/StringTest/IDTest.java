package StringTest;

public class IDTest {
    public static void main(String[] args) {
        String ID = "340122200110296913";
        String year = ID.substring(6, 10);
        String month = ID.substring(10, 12);
        String day = ID.substring(12, 14);
        byte genderNumber = (byte) (((byte) (ID.charAt(16))) - 48);
        String gender = "";
        if (genderNumber % 2 == 0) {
            gender = "女";
        } else {
            gender = "男";
        }


        System.out.print("出生日期为: " + year + "年 " + month + "月 " + day + "日, 性别为"+ gender);


    }

}
