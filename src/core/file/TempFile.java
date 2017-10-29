package core.file;

import java.io.File;
import java.io.IOException;

public class TempFile {

    public static void main(String[] args) {
        try {
            File tmpFile = File.createTempFile("data", null);
            File newFile = File.createTempFile("text", ".temp", new File("/Users/prologistic/tmp"));
            System.out.println(tmpFile.getCanonicalPath());
            System.out.println(newFile.getCanonicalPath());

            // работайте с временным файлом как с обычным файлом

            // удаляем файл после того, как ваша программа закончила работу
            tmpFile.deleteOnExit();
            newFile.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
