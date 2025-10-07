package com.tcmyxc.ajt;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密工具类
 * @author tcmyxc
 */
public class EncryptUtils {

    private static final int SALT_LENGTH = 8;

    /**
     * 获取给定字符串的MD5值
     * @param str
     * @return
     */
    public static String getMd5(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }

        // 下面的代码由通义灵码生成
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(str.getBytes());

            // 转换为十六进制字符串
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * 双重MD5加密（随机加盐）
     * @param str
     * @return
     */
    public static String getDualMd5WithSalt(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }

        return getMd5(getMd5(str) + IdUtils.getSimpleUUID().substring(0, SALT_LENGTH));
    }

    /**
     * 双重MD5加密（指定盐）
     * @param str
     * @param salt
     * @return
     */
    public static String getDualMd5WithSalt(String str, String salt) {
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(salt)) {
            return null;
        }

        return getMd5(getMd5(str) + salt);
    }
}
