package top.bright.pojo;

public class Account {
    private int id;
    private String age;
    private Double money;

    public Account() {
    }

    public Account(int id, String age, Double money) {
        this.id = id;
        this.age = age;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", age='" + age + '\'' +
                ", money=" + money +
                '}';
    }
}
