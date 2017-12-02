package MyUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirectoryTree {
    private static StringBuilder builder = new StringBuilder("\t");

    public static void  writeFileNames(File path,File fileForWrite, StringBuilder builder) throws IOException {
        FileWriter writer = new FileWriter(fileForWrite,true);
        for (File file : path.listFiles()) {
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

    public static void main(String[] args) throws IOException {
        File srcPath = new File("D:/Java/0_Java_Projects/topjava/src");
        File fileForWriteSrc = new File("D:/Java/0_Java_Projects/MyCribSheets/TreeTopjava.txt");
        fileForWriteSrc.delete();
        writeFileNames(srcPath,fileForWriteSrc,builder);
    }
}
