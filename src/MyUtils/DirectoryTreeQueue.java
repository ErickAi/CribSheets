package MyUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class DirectoryTreeQueue {

    private static StringBuilder builder = new StringBuilder("\t");
    private static File srcPath = new File("D:/Java/0_Java_Projects/topjava/src");
    private static File fileForWriteSrc = new File("D:/Java/0_Java_Projects/MyCribSheets/TreeTopjava.txt");

    private static List<String> resultTree = new ArrayList<>();

    public static void main(String[] args) throws IOException {
//        fileForWriteSrc.delete();
//        writeFileNames(srcPath,fileForWriteSrc,builder);

        DirectoryTreeQueue myClas = new DirectoryTreeQueue();
        myClas.createTree(srcPath,fileForWriteSrc);
        for (String s : resultTree) {
            System.out.println(s);
        }

    }

    private void createTree(File root, File forWrite) {
        Queue<File> fileTree = new PriorityQueue<>();
        Collections.addAll(fileTree, root.listFiles());

        while (!fileTree.isEmpty()) {
            File currentFile = fileTree.remove();
            if (currentFile.isDirectory()) {
                Collections.addAll(fileTree, currentFile.listFiles());
                resultTree.add((currentFile.getName()));
            } else {
                resultTree.add(currentFile.getName());
            }
        }
    }
}
