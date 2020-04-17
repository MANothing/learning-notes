package com.open4cn.standard.variable.init;

/**
 * @author yinxp
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @date 2020-04-2020/4/17 16:03
 * @Email: yinxp@dist.com.cn
 * @Desc：
 */
public class Test {

    public static void main(String[] args) {

        if (true) {
            String s1 = "s1";
        } else {
            // 无法读取到s1
//            System.out.println(s1);
        }

        Integer i1 = 1;
        switch (i1) {
            case 0:
                String s2 = "s2";
                break;
            case 1:
                // s2在上一个case声明，此case内可以使用
                s2 = "ss";
                s2.hashCode();
                break;
            default:
        }
    }
}
