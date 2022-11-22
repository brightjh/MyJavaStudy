package top.brightzm.controller;

/**
 * @description: 标识码
 * @author: bright
 * @time: 2022/11/15 下午3:15
 */
public class Code {

    // 操作成功
    public static final Integer GET_OK = 20011;
    public static final Integer ADD_OK = 20021;
    public static final Integer UPDATE_OK = 20031;
    public static final Integer DEL_OK = 20041;

    // 操作失败
    public static final Integer GET_ERR = 20010;
    public static final Integer ADD_ERR = 20020;
    public static final Integer UPDATE_ERR = 20030;
    public static final Integer DEL_ERR = 20040;

    // 异常
    public static final Integer SYSTEM_EX = 50011;

    public static final Integer SYSTEM_TIMEOUT_EX = 50012;

    public static final Integer SYSTEM_UNKNOWN_EX = 50013;

    public static final Integer BUSINESS_EX = 60011;


}
