package com.tcmyxc.ajt;

/**
 * 随机码生成工具类
 *
 * @author tcmyxc
 */
public class RandomCodeUtils {

    private RandomCodeUtils() {
    }

    /**
     * 默认的随机码字典
     */
    private static final String DEFAULT_RANDOM_CODE_DICTIONARIES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";


    /**
     * 生成指定长度的随机码
     *
     * @param length
     * @return
     */
    public static String generateRandomCode(int length) {
        return generateRandomCode(length, DEFAULT_RANDOM_CODE_DICTIONARIES);
    }

    /**
     * 根据字典生成指定长度的随机码
     *
     * @param length
     * @param dictionaries
     * @return
     */
    public static String generateRandomCode(int length, String dictionaries) {
        if (length <= 0 || StringUtils.isBlank(dictionaries)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * dictionaries.length());
            sb.append(dictionaries.charAt(index));
        }
        return sb.toString();
    }
}
