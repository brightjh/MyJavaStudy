package objectsTest;

public class StudentTest {
    public static void main(String[] args) {
        Student[] array = new Student[3];
        Student stu1 = new Student(22, "宋媛娜", 20);
        Student stu2 = new Student(25, "唐俊豪", 20);
        array[0] = stu1;
        array[1] = stu2;
        Student stu3 = new Student(1, "zs", 22);
        boolean result = contains(array, stu3.getStuID());
        int count = contains(array);
        if (result) {
            System.out.println("学号已存在");
        } else if (count < array.length) {
            array[count] = stu3;
            rangArray(array);
        } else if (count == array.length) {
            array = newArray(array);
            array[count] = stu3;
            rangArray(array);
        } else {
            System.out.println("其他错误");
        }

        int delStuID = 1;
        int delIndex = getIndex(array,delStuID);
        if (delIndex>=0){
            array[delIndex] = null;
        }else {
            System.out.println("删除失败");
        }

        rangArray(array);

        int selStuID = 25;
        int selIndex = getIndex(array,selStuID);
        if (selIndex>=0) {
            array[selIndex].setAge(array[selIndex].getAge()+1);
        }

        rangArray(array);


    }


    public static boolean contains(Student[] array, int stuID) { // 判断stuID是否在数组中存在
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && stuID == array[i].getStuID()) {
                return true;
            }
        }
        return false;
    }

    public static int contains(Student[] array) {  // 判断数组有多少空位
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                count++;
            }
        }
        return count;

    }

    public static Student[] newArray(Student[] array) {  // 如果数组长度不够就创建一个多一位的新数组
        Student[] newArray = new Student[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static void rangArray(Student[] array) { // 遍历输出数组所有数据
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.println(array[i].getStuID() + "," + array[i].getName() + "," + array[i].getAge());
            }

        }
    }

    public static int getIndex(Student[] array, int stuID) { // 获取stuID在数组中的索引
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getStuID() == stuID) {
                return i;
            }

        }
        return -1;
    }


//    public static void delStu(Student[] array, int delStuID) {
//        if (contains(array, delStuID)) {
//            for (int i = 0; i < array.length; i++) {
//                if (array[i].getStuID() == delStuID) {
//                    array[i] = null;
//                }
//            }
//        } else {
//            System.out.println("删除失败");
//        }
//
//    }

//    public static void ageAdd(Student[] array, int selectStuID) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != null && array[i].getStuID() == selectStuID) {
//                array[i].setAge(array[i].getAge() + 1);
//            }
//        }
//
//    }

}
