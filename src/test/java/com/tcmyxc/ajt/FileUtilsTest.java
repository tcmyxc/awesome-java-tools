package com.tcmyxc.ajt;

public class FileUtilsTest {
    public static void main(String[] args) {
        System.out.println(FileUtils.getFileExt("tcmyxc.txt"));
        System.out.println(FileUtils.getFileExt("tcmyxc"));

        FileUtils.listFiles("D:\\").forEach(System.out::println);
    }
}
