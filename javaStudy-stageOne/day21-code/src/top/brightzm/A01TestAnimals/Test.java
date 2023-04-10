package top.brightzm.A01TestAnimals;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // 测试类中定义一个方法用于饲养动物
        // 饲养猫
        ArrayList<PersianCat> persianCats = new ArrayList<>();
        persianCats.add(new PersianCat("kity",2));
        persianCats.add(new PersianCat("titi",3));
        System.out.println(persianCats);
        //keepCat(persianCats);
        ArrayList<ChineseLiHuaCat> chineseLiHuaCats = new ArrayList<>();
        chineseLiHuaCats.add(new ChineseLiHuaCat("咪咪",2));
        chineseLiHuaCats.add(new ChineseLiHuaCat("小花",3));
        System.out.println(chineseLiHuaCats);
        //keepCat(chineseLiHuaCats);

        // 饲养狗
        ArrayList<Teddy> teddies = new ArrayList<>();
        teddies.add(new Teddy("tt",3));
        teddies.add(new Teddy("ee",3));
        System.out.println(teddies);
        //keepDog(teddies);

        ArrayList<Husky> huskies = new ArrayList<>();
        huskies.add(new Husky("hh",2));
        huskies.add(new Husky("uu",3));
        System.out.println(huskies);
        //keepDog(huskies);

        // 饲养动物
        keepAnimal(persianCats);
        keepAnimal(chineseLiHuaCats);
        keepAnimal(teddies);
        keepAnimal(huskies);

    }

    // 该方法能够养所有品种的猫，但是不能养狗
    public static void keepCat(ArrayList<? extends Cat> list){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eating();
        }
    }

    // 该方法能够养所有品种的狗，但是不能养猫
    public static void keepDog(ArrayList<? extends Dog> list){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eating();
        }
    }

    // 该方法能够养所有的动物，但是不能传递其他类型
    public static void keepAnimal(ArrayList<? extends Animal> list){
        for (int i = 0; i < list.size(); i++) {
            list.get(i).eating();
        }
    }
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if((nums[i] + nums[j]) == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

}





