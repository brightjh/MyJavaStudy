package studentManage;

public class Users {
    private String userName;
    private String password;
    private String userID;
    private String phoneNumber;

    public Users() {
    }

    public Users(String useName, String password, String userID, String phoneNumber) {
        this.userName = useName;
        this.password = password;
        this.userID = userID;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
