package top.brightzm.myArrayListDemo;

// E表示不确定的变量名
//泛型类
import java.util.Arrays;

public class MyArrayList<E> {
    // 自己编写ArrayList
    Object[] obj = new Object[10];
    int size;

    /*E表示未确定的变量类型
    * e表示变量名称*/

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[index];

    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
