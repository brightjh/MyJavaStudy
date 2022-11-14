package objectsTest;

public class GameTest {
    public static void main(String[] args) {
//        创建游戏人物
        GameRole2 role1 = new GameRole2("乔峰",120,'男');
        GameRole2 role2 = new GameRole2("鸠摩智",90,'男');

        System.out.println(" 角色一 姓名: "+role1.getName()+" 性别: "+role1.getGender()+ " 长相: "+role1.getFace());
        System.out.println(" 角色二 姓名: "+role2.getName()+" 性别: "+role2.getGender()+ " 长相: "+role2.getFace());


//        进行格斗
        while (true){
            role1.attack(role2);
            System.out.println(role2.getBloodBar());
            if(role2.getBloodBar()==0){
                System.out.println(role1.getName()+"K.0.了"+role2.getName());
                break;
            }

            role2.attack(role1);
            System.out.println(role1.getBloodBar());
            if(role1.getBloodBar()==0){

                System.out.println(role2.getName()+"K.0.了"+role1.getName());
                break;
            }




        }



    }
}
