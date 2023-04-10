package extendsTest2;

public class Accident extends Staff {

    public Accident() {
    }

    public Accident(String ID, String name, int salary) {
        super(ID, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }

}
