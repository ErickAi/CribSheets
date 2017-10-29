package syntax.examples;


import java.io.File;
import java.io.FileWriter;

public class Test {
    public static void main(String[] args) throws Exception {
        File file=null;
        for (int i = 1; i < 16; i++) {
            file = File.createTempFile("tex","t");
            FileWriter writer = new FileWriter(file);
            writer.write(String.format("Начало %dго файла\nСодержимое файла\nКонец %dго файла\n\n",i,i));
            writer.close();
            file.renameTo(new File(String.format("file.txt.part%d",i)));
        }
        /*System.out.println("Полный путь к файлу: " + file.getAbsolutePath());
        if (file.exists()) {
            final File parentFolder = new File(file.getAbsolutePath()
                    .substring(0, file.getAbsolutePath().lastIndexOf(
                            File.separator)));
            System.out.println("Полный путь к родительскому каталогу: "
                    + parentFolder.getAbsolutePath());
        } else {
            System.out.println("Файл не существует.");
        }*/


    }
}
