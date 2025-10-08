package com.tcmyxc.ajt;

public class EncryptUtilsTest {

    public static void main(String[] args) {
        System.out.println(EncryptUtils.getMd5("  "));
        System.out.println(EncryptUtils.getMd5("tcmyxc"));
        System.out.println(EncryptUtils.getDualMd5WithSalt("tcmyxc"));
        System.out.println(EncryptUtils.getDualMd5WithSalt("tcmyxc", "salt"));
    }
}
