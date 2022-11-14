package extendsTest3;

public class Tutor extends Teacher{

    public Tutor() {
    }

    public Tutor(String id, String name, String work) {
        super(id, name, work);
    }

    @Override
    public void work(){
        System.out.println("助教正在帮助讲师和同学");
    }

}
