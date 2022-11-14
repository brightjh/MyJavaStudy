package top.brightzm.dao.impl;

import top.brightzm.dao.BookDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @description:
 * @author: bright
 * @time: 2022/10/29 下午4:53
 */
public class BookDaoImpl implements BookDao {


    private int[] array;

    private List<String> list;

    private Set<String> set;

    private Map<String,String> map;

    private Properties properties;

    public BookDaoImpl() {
    }

    public BookDaoImpl(int[] array, List<String> list, Set<String> set, Map<String, String> map, Properties properties) {
        this.array = array;
        this.list = list;
        this.set = set;
        this.map = map;
        this.properties = properties;
    }


    @Override
    public void save() {
        System.out.println("BookDao save..........");
    }

    /**
     * 获取
     * @return array
     */
    public int[] getArray() {
        return array;
    }

    /**
     * 设置
     * @param array
     */
    public void setArray(int[] array) {
        this.array = array;
    }

    /**
     * 获取
     * @return list
     */
    public List<String> getList() {
        return list;
    }

    /**
     * 设置
     * @param list
     */
    public void setList(List<String> list) {
        this.list = list;
    }

    /**
     * 获取
     * @return set
     */
    public Set<String> getSet() {
        return set;
    }

    /**
     * 设置
     * @param set
     */
    public void setSet(Set<String> set) {
        this.set = set;
    }

    /**
     * 获取
     * @return map
     */
    public Map<String, String> getMap() {
        return map;
    }

    /**
     * 设置
     * @param map
     */
    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    /**
     * 获取
     * @return properties
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * 设置
     * @param properties
     */
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String toString() {
        return "BookDaoImpl{array = " + array + ", list = " + list + ", set = " + set + ", map = " + map + ", properties = " + properties + "}";
    }

   /* // 表示bean初始化对应的操作
    public void init(){
        System.out.println("dao init...");
    }

    // 销毁前操作
    public void destroy(){
        System.out.println("dao destroy.....");
    }*/


}
