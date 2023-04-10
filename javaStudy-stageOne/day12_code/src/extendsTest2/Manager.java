package extendsTest2;

public class Manager extends Staff {

    private double bouns;

    // 空参构造
    public Manager() {
    }

    // 全参构造
    public Manager(String ID, String name, double salary, double bouns) {
        super(ID, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("经理正在管理其他人");
    }

}
