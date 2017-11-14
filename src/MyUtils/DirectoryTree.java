package MyUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirectoryTree {
    private static StringBuilder builder = new StringBuilder("\t");

    public static void  writeFileNames(File path, StringBuilder builder) throws IOException {
        FileWriter writer = new FileWriter("D:/Java/0_Java_Projects/MyCribSheets/TreeTopjava.txt",true);
        for (File file : path.listFiles()) {
            writer.write(builder + file.getName() + "\n");
            writer.flush();
            if (file.isDirectory()) {
                builder.append("\t");
                writeFileNames(file,builder);
            }
        }
        builder.deleteCharAt(0);
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        File path = new File("D:/Java/0_Java_Projects/topjava/src/main");
        File fileForWrite = new File("D:/Java/0_Java_Projects/MyCribSheets/TreeTopjava.txt");
        fileForWrite.delete();
        writeFileNames(path,builder);
    }
}
