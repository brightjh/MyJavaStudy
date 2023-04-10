package top.brightzm.myArrayListDemo;

import java.util.Arrays;

// 泛型类
public class ListUtil<E> {

    Object[] obj = new Object[10];
    int size;

    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public boolean addAll(E[] es) {
        for (int i = 0; i < es.length; i++) {
            obj[size] = es[i];
            size++;
        }
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    public String toString(){
        return Arrays.toString(obj);
    }

}
