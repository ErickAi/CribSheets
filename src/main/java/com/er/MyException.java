package com.er;

public class MyException extends Error {
    public static void main(String[] args) {
        try{
            throw new MyException();
        }catch (MyException e){
            System.out.println("e catched");
            System.err.println(e.getCause());
        }
    }
}
