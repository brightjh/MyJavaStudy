package top.brightzm.json;

import com.alibaba.fastjson.JSON;

public class JsonDemo1 {
    public static void main(String[] args) {
        // 将java对象转为json字符串
        User user = new User("syn",20,'女');

        String s = JSON.toJSONString(user);
        System.out.println(s);


        // 将json转为java对象
        User u = JSON.parseObject("{\"age\":20,\"gender\":\"女\",\"name\":\"syn\"}", User.class);
        System.out.println(u);

    }

}
