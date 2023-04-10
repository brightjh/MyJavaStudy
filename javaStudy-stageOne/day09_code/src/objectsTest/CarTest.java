package objectsTest;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car [] array = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"辆车");
            System.out.println("输入汽车品牌");
            String brand = sc.next();
            System.out.println("输入汽车价格");
            double price = sc.nextDouble();
            System.out.println("输入汽车颜色");
            String color = sc.next();
            Car cari = new Car(brand,price,color);
            array[i] = cari;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getBrand()+","+array[i].getPrice()+","+array[i].getColor());
        }

    }
}
