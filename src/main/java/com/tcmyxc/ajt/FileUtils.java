package com.tcmyxc.ajt;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件工具类
 */
public class FileUtils {

    /**
     * 获取文件扩展名
     * @param fileName
     * @return
     */
    public static String getFileExt(String fileName) {
        if (StringUtils.isEmpty(fileName)) {
            return null;
        }

        int index = fileName.lastIndexOf(".");
        if (index == -1) {
            return null;
        }

        return fileName.substring(index + 1);
    }

    /**
     * 列举指定目录下的所有文件
     * @param path
     * @return
     */
    public static List<String> listFiles(String path) {
    	if(StringUtils.isEmpty(path)){
            return null;
        }

        // 列举出path下的所有文件
        File dir = new File(path);
        File[] files = dir.listFiles();
        List<String> fileList = new ArrayList<>();
        for(File file : files){
            fileList.add(file.getAbsolutePath());
        }
        return fileList;
    }
}
