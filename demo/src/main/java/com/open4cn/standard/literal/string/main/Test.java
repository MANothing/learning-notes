package com.open4cn.standard.literal.string.main;

import com.open4cn.standard.literal.string.other.Other;

/**
 * @author yinxp
 * @Company: 上海数慧系统技术有限公司
 * @Department: 数据中心
 * @date 2020-04-2020/4/16 14:50
 * @Email: yinxp@dist.com.cn
 * @Desc：
 */
public class Test {

    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";

        System.out.println((hello == "Hello"));
        System.out.println((MainOther.hello == "Hello"));
        System.out.println((Other.hello == "Hello") );
        System.out.println((hello == "Hel"+"lo"));  // 常量表达式，编译时计算，运行时已经是完整的"Hello"
        System.out.println((hello == "Hel"+lo));    //  运行时创建
        System.out.println((hello == ("Hel" + lo).intern()));   // intern()限定了共享唯一实例

        /**
         *
         true
         true
         true
         true
         false
         true
         */
    }
}
