package top.brightzm.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @description:
 * @author: bright
 * @time: 2023/3/28 上午10:49
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "dd", "ccd", "adc", "wed", "qwe", "erg");
        System.out.println(list);

        Collections.sort(list);

    }
}
