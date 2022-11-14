package top.brightzm.setDemo;

public class TestStudent implements Comparable<TestStudent> {
    private String name;
    private int age;
    private int score;
    private int chinese;
    private int math;
    private int english;


    public TestStudent() {
    }

    public TestStudent(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.score = chinese+math+english;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * 获取
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return "TestStudent{name = " + name + ", age = " + age + ", score = " + score + ", chinese = " + chinese + ", math = " + math + ", english = " + english + "}";
    }

    @Override
    public int compareTo(TestStudent o) {
        // 先按总分进行排序
        int i = o.getScore() - this.getScore();
        // 按语文进行排序
        i = i == 0 ? o.getChinese() - this.getChinese() : i;
        // 按数学进行排序
        i = i == 0 ? o.getMath() - this.getMath() : i;
        // 按英语进行排序(ps: 可以省略不写)
        i = i == 0 ? o.getEnglish() - this.getEnglish() : i;
        // 按年龄进行排序
        i = i== 0 ? o.getAge() - this.getAge() : i ;
        // 按姓名进行排序
        i = i == 0 ? o.getName().compareTo(this.getName()) : i;
        return i;
    }
}
