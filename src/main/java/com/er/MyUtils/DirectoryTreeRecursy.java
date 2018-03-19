package com.er.MyUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirectoryTreeRecursy {
    private static StringBuilder builder = new StringBuilder("\t");
    static private File srcPath = new File("D:/Java/0_Java_Projects/basejava");
    private static File fileForWriteSrc = new File("D:/Java/0_Java_Projects/basejava/home_works/TreeBaseJava.txt");

    public static void main(String[] args) throws IOException {
        fileForWriteSrc.delete();
        writeFileNames(srcPath,fileForWriteSrc,builder);
    }

    private static void  writeFileNames(File path, File fileForWrite, StringBuilder builder) throws IOException {
        FileWriter writer = new FileWriter(fileForWrite,true);
        for (File file : path.listFiles()) {
            if (path.getName().endsWith(".idea") || path.getName().endsWith(".git") || path.getName().endsWith("home_works")) {
                return;
            }
            if (file.isFile()){
                writer.write(builder + "-" + file.getName() + "\n");
                writer.flush();
            }
            if (file.isDirectory()) {
                writer.write(builder + file.getName() + "\n");
                writer.flush();

                builder.append("\t");
                writeFileNames(file,fileForWrite,builder);
            }
        }
        builder.deleteCharAt(0);
        writer.close();
    }

}
