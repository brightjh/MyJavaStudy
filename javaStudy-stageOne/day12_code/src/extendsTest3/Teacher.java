package extendsTest3;

public class Teacher extends Employee{

    public Teacher() {
    }

    public Teacher(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work(){
        System.out.println("教职部员工正在工作");
    }

}
