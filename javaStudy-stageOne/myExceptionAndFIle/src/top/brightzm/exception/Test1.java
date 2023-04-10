package top.brightzm.exception;

import top.brightzm.exception.domain.Person;

import java.util.Scanner;

/**
 * @description:
 * @author: bright
 * @time: 2023/4/3 上午10:28
 */
public class Test1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Person person = new Person();

        while (true) {
            try {
                System.out.println("请输入姓名:");

                person.setName(sc.nextLine());

                System.out.println("请输入年龄:");

                person.setAge(Integer.parseInt(sc.nextLine()));

                break;
            } catch (NumberFormatException | NameFormatException | AgeOutOfBoundsException e) {
                e.printStackTrace();
            }
        }

        System.out.println(person);

    }


}
