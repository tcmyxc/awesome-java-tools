package com.tcmyxc.ajt;

public class RandomCodeUtilsTest {
    public static void main(String[] args) {
        System.out.println(RandomCodeUtils.generateRandomCode(6));
        System.out.println(RandomCodeUtils.generateRandomCode(6, "0123456789"));
        System.out.println(RandomCodeUtils.generateRandomCode(6, "ABCDEFG"));
        System.out.println(RandomCodeUtils.generateRandomCode(6, "abcdefg"));
        System.out.println(RandomCodeUtils.generateRandomCode(6, "!@#$%&"));
    }
}
