package com.tcmyxc.ajt;

/**
 * Id工具类
 * @author tcmyxc
 */
public class IdUtils {

    /**
     * 获取不带横线的随机UUID
     *
     * @return 随机UUID
     */
    public static String getSimpleUUID() {
        return java.util.UUID.randomUUID().toString().replace("-", "");
    }
}
