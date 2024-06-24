// Write a java Program to list out recently (within 1 min) updated file list.

import java.io.*;

public class Main {
    public static void main(String args[]){
        String dirPath = "SomeFolder";
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if(files != null){
            long threshold = System.currentTimeMillis()-(1 * 60 * 1000);
            for(File file : files){
                if(file.lastModified() >= threshold){
                    System.out.println(file.getName());
                }
            }
        }
    }
}
