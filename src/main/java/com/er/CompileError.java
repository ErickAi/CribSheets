package com.er;

import java.util.Date;

public class CompileError {
    public static void main(String[] args) {
        //char[] a = "";
        //String f = new char[1]{a};
        //(new Object().toString());
        char[] b = {'a'};
        int[] c = {1};
        int[] d = {};
        char[] e = {};
        Class<?> clazz = (Long.class);
        int a = new Integer(1);
        int z = 2+new Integer(2);
        Class<?> cl = float.class;
        System.out.println(cl.getClass());
//        Class.forName(boolean);
        new Date().getClass();
        (new Object()).toString();

    }
}
