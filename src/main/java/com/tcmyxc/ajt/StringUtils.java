package com.tcmyxc.ajt;

/**
 * 字符串工具类
 *
 * @author tcmyxc
 */
public class StringUtils {

    private StringUtils() {
    }

    /**
     * 判断字符串是否为空，null或者""都返回true
     */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * 判断字符串是否不为空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 判断字符串是否为空或者空白字符串，null，""，" "都返回true
     */
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }
}
