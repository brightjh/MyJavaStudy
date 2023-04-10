package top.brightzm.setDemo;

import java.util.TreeSet;

public class A07TreeSetTest {
    public static void main(String[] args) {
        // 创建5个学生对象，进行排序
        // 依次按总分，语文，数学，英语，年龄,姓名进行降序排序，如果都一样认为是同一个学生

        // 创建学生对象
        TestStudent s1 = new TestStudent("zhangsan",23,90,95,61);
        TestStudent s2 = new TestStudent("lisi",24,90,95,61);
        TestStudent s3 = new TestStudent("wangwu",25,90,95,65);
        TestStudent s4 = new TestStudent("wangwu",25,90,95,66);
        TestStudent s5 = new TestStudent("zhaoliu",25,89,95,65);

        // 添加到TreeSet集合中
        /*TreeSet<TestStudent> ts = new TreeSet<>(new Comparator<TestStudent>() {
            @Override
            public int compare(TestStudent o1, TestStudent o2) {
                // 先按总分进行排序
                int i = o2.getScore() - o1.getScore();
                // 按语文进行排序
                i = i == 0 ? o2.getChinese() - o1.getChinese() : i;
                // 按数学进行排序
                i = i == 0 ? o2.getMath() - o1.getMath() : i;
                // 按英语进行排序
                i = i == 0 ? o2.getEnglish() - o1.getEnglish() : i;
                // 按年龄进行排序
                i = i== 0 ? o2.getAge() - o1.getAge() : i ;
                return i;
            }
        });*/

        TreeSet<TestStudent> ts = new TreeSet<>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        // 打印集合
        for (TestStudent s : ts){
            System.out.println(s);
        }


    }

}
