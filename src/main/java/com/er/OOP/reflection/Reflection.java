package com.er.OOP.reflection;

import java.lang.reflect.*;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        SomeClass someClass = new SomeClass();
        Class clss1 = SomeClass.class;
        Class clss2 = someClass.getClass();
        Class clss3 = Class.forName("com.er.OOP.reflection.SomeClass");
//        Class clssFromOtherPackage = ClassLoader.getSystemClassLoader().loadClass("com.javarush.task.task35.task3507.AnimalClassLoader.java");
//        System.out.println(clssFromOtherPackage);
        SomeClass newSomeClass = (SomeClass) clss3.newInstance();

        System.out.println(clss2.getName());
        Constructor[] constructors = clss1.getConstructors();
        for (Constructor c : constructors){
            System.out.println("\t" + c.getClass().getSimpleName());
            Parameter[] parameters = c.getParameters();
            System.out.println(parameters.length<1 ? "\t\tPARAMETERS empty" : "\t\tPARAMETERS");
            for ( Parameter p : parameters){
                System.out.println("\t\t" + p.getName() + " " + p.getType());
            }
        }

        Method[] methods = clss1.getDeclaredMethods();
        System.out.println("\tMETHODS");
        for (Method m : methods){
            System.out.print("\t" + m.getName());
            System.out.println(" MODIFIERS " + Modifier.toString(m.getModifiers()));
            Parameter[] parameters = m.getParameters();
            System.out.println(parameters.length<1 ? "\t\tPARAMETERS empty" : "\t\tPARAMETERS");
            for ( Parameter p : parameters){
                System.out.println("\t\t" + p.getName() + " " + p.getType());
            }
        }

        Field[] fields = clss1.getDeclaredFields();
        System.out.println("\tFIELDS");
        for(Field f : fields){
            System.out.print("\t" + f.getName() + " TYPE " + f.getType());
            System.out.println(" MODIFIERS " + Modifier.toString(f.getModifiers()));
        }

        try {
            System.out.println("\nTrying to set value to field");
            Field field = clss1.getDeclaredField("s");
            field.setAccessible(true);
            System.out.println("BEFORE s = " + field.get(someClass));
            field.set(someClass, "this is success");
            System.out.println("AFTER s = " + field.get(someClass));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        //TODO заинжектить поля через конструктор
        // Constructor constructor = clss1.getDeclaredConstructor()
    }
}
