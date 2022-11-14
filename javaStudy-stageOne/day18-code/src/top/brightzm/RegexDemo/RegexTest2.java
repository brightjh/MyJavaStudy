package top.brightzm.RegexDemo;

public class RegexTest2 {
    public static void main(String[] args) {
        // 验证用户名是否符合要求 要求: 大小写字母,数字,下划线 4-16位
        String username = "bright_zm";

        String regex1 = "\\w{4,16}";

        System.out.println(username.matches(regex1));

        // 验证身份证号是否满足要求(简单)
        String userID = "340122202208221234";
        
        String regex2 = "[1-9]\\d{16}[\\dXx]";

        String regex3 = "[1-9]\\d{16}(\\d|x|X)";

        String regex4 = "[1-9]\\d{16}(\\d|(?i)x)";

        System.out.println(userID.matches(regex4));


        // 验证身份证号码(严格)
        // 340122 20220822 1234
        // 前面6位 省市 派出所 第一位不能是0 后面5位任意数字
        // 年前半段 18 19 20
        // 年后半段 两位任意数字
        // 月份 01-09 10 11 12
        // 日期 01-31
        // 后面四位,三位任意数字 最后一位数字或者大小写X
        //                  前6                   年份                    月份               日期                  后4
        //                --------| ----------------------------- | ----------- | ----------------------| ---------------
        String regex5 = "[1-9]\\d{5}(18[89]\\d|19\\d{2}|20[0-2]\\d)(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])\\d{3}(\\dXx)";
        System.out.println("--------------------------------------------");
        System.out.println(userID.matches(regex5));

        String regex6 = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0\\d|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";

    }
}
