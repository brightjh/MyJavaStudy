package arrayLIstTest;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        // 获取id,返回索引

        ArrayList<User> userList = new ArrayList<>();

        User user1 = new User("001","user1","user1");
        User user2 = new User("002","user2","user2");
        User user3 = new User("003","user3","user3");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        int index = getIndex("005",userList);
        System.out.println(index);

    }

    // 根据ID获取索引
    public static int getIndex(String id , ArrayList<User> userArrayList){
        for (int i = 0; i < userArrayList.size(); i++) {
            if (id.equals(userArrayList.get(i).getId())){
                return i;
            }
        }
        return -1;
    }

}
