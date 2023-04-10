package top.brightzm.ObjectDemo;

import java.util.StringJoiner;


// 标记可被克隆
public class User implements Cloneable {
    private int id;
    private String username;
    private String password;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", data=" + arrayToString(data) +
                '}';
    }

    public String arrayToString(int[] data){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+"");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // 默认浅克隆
//        return super.clone();

        // 实现深克隆
        int[] data = this.data;
        int[] newData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        User u = (User) super.clone();
        // 将Object克隆的对象的数组进行替换
        u.setData(newData);
        return u;


    }
}
