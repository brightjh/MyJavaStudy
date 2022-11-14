package extendsTest3;

public class Maintainer extends AdminStaff{

    public Maintainer() {
    }

    public Maintainer(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work(){
        System.out.println("维护专员正在维护");
    }

}
