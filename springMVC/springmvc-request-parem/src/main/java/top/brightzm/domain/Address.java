package top.brightzm.domain;

/**
 * @description:
 * @author: bright
 * @time: 2022/11/9 上午8:25
 */
public class Address {

    private String province;

    private String city;


    public Address() {
    }

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    /**
     * 获取
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Address{province = " + province + ", city = " + city + "}";
    }
}
