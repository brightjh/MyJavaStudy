package top.brightzm.getClassDemo;

/**
 * @description: 获取class
 * @author: bright
 * @time: 2022/11/2 上午9:34
 */
public class getClass01 {
    public static void main(String[] args){
        //// 1.直接通过class的静态变量获取
        //Class cls01 = String.class;
        //
        //System.out.println(cls01.getClasses());
        //
        //// 2.通过实例变量获取
        //String s = "Hello";
        //Class cls02 = s.getClass();
        //System.out.println(cls02.getClasses());
        //
        //// 3.通过静态方法写入类名获取
        //try {
        //    Class cls03 = Class.forName("java.lang.String");
        //    System.out.println(cls03.getClasses());
        //}catch (ClassNotFoundException e){
        //    e.printStackTrace();
        //}
        //
        //// 比较是否是同一个实例
        //boolean result = cls01 == cls02;
        //System.out.println(result);

        // 输出class的信息
        Class cls = String.class;
        printClassInfo(cls);
    }

    /**
     * 输出 class的信息
     * @param cls
     */
    public static void printClassInfo(Class cls){
        System.out.println("Class Name:" + cls.getName());
        System.out.println("Simple Name:"+ cls.getSimpleName());
        if (cls.getPackage() != null){
            System.out.println("Package Name:" + cls.getPackage());
        }
        System.out.println("is Interface:" + cls.isInterface());
        System.out.println("is enum:" + cls.isInterface());
        System.out.println("is array:" + cls.isArray());
        System.out.println("is primitive:" + cls.isPrimitive());

    }

}
