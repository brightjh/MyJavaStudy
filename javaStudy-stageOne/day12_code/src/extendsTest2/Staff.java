package extendsTest2;

public class Staff {
    private String ID;
    private String name;
    private double salary;

    public void work() {
        System.out.println("工作");
    }

    public void eat() {
        System.out.println("正在吃米饭");
    }

    public Staff() {
    }

    public Staff(String ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
