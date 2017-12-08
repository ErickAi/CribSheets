package com.er.syntax.examples;


import java.io.*;

public class FileNotFoundBreakLable {
    public static void main(String[] args) throws IOException {
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        while (true) {
            if("e".equals(breader.readLine()))
                break;
            ifFileNotFound:{
                name = breader.readLine();
                try {
                    FileInputStream fis = new FileInputStream(name);
                    fis.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("файла " + name + " не существует. попробуйте еще раз");
                    break ifFileNotFound;
                }
            }


        }
    }
}
