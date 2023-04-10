package extendsTest3;

public class Buyer extends AdminStaff{

    public Buyer() {
    }

    public Buyer(String id, String name, String work) {
        super(id, name, work);
    }

    public void work(){
        System.out.println("采购专员正在采购");
    }

}
