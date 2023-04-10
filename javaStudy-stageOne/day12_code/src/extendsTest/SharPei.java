package extendsTest;

public class SharPei extends Dog{

    // 重写需求
    @Override
    public void eat(){
        super.eat(); // 需要使用父类中的方法
        System.out.println("沙皮狗正在吃骨头");
    }

}
