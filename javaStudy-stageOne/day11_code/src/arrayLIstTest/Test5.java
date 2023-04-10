package arrayLIstTest;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<User> userList = new ArrayList<>();

        // 创建user对象
        User user1 = new User("001","user1","user1");
        User user2 = new User("002","user2","user2");
        User user3 = new User("003","user3","user3");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        String searchID = "003";
        boolean result = searchUser(searchID,userList);
        System.out.println(result);

    }

    public static boolean searchUser(String id, ArrayList<User> userArrayList){
        for (int i = 0; i < userArrayList.size(); i++) {
            if (id.equals(userArrayList.get(i).getId())){
                return true;
            }
        }
        return false;
    }

}
