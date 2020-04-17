package com.open4cn.standard.type.integer;

/**
 * @author yinxp
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @date 2020-04-2020/4/16 15:04
 * @Email: yinxp@dist.com.cn
 * @Desc：
 */
public class Test {

    public static void main(String[] args) {

        short s1 = 1;
        short s2 = 1;
        int int1 = 2;
        long long1 = 3;

        long l = int1 + long1;
        long l1 = s1 + long1;

        int i = s1 + int1;

        // short + short = int
        int i1 = s1 + s2;

    }
}
