package top.bright.test3;

public class Test {
    public static void main(String[] args) {
        // 创建乒乓球运动员对象
        TableTennisPlayer ttp = new TableTennisPlayer("张三",22);
        System.out.println(ttp.getName()+","+ttp.getAge());
        ttp.study();
        ttp.speakEnglish();

        System.out.println("==========================");

        // 创建篮球运动员对象
        BasketballPlayer bp = new BasketballPlayer("李四",21);
        bp.study();


        System.out.println("==========================");

        // 创建乒乓球教练对象
        TableTennisCoach ttc = new TableTennisCoach("王五",38);
        ttc.teach();
        ttc.speakEnglish();

        System.out.println("==========================");

        // 创建篮球教练对象
        BasketballCoach bc = new BasketballCoach("赵六",41);
        bc.teach();


    }
}
