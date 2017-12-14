package com.er.OOP.classLoader;

public class InitialisationAndLoading {
    public static void main(String[] args) {
//        System.out.println(A.strStatic + "\n");
//        A a1 = new A();
//        System.out.println("");
//        A a2 = new A(9999, "А в конструкторе");
//        System.out.println("\na1 " + a1.toString() + "\na2 " + a2.toString());
//        System.out.println();
//        B b1 = new B();
//        System.out.println(b1);
        B b2 = new B(9999, "B в конструкторе");
        System.out.println(b2);

    }
}

class A {
        static String strStatic = "aStatic Инициализированно при объявлении";
        String strA;
        int intA;
        {
            System.out.println("A Анонимный блок инициализации");
            strA = "A в анонимном";
            intA = 33333;
        }
        static {
            System.out.println("A Статический блок инициализации");
            strStatic = "aStatic Инициализированно в статическом блоке";
        }
        A (){
            System.out.println("Конструктор А()");
        }
        A (int intA, String strA){
            System.out.println("Конструктор А(int intA, String strA)");
            this.intA = intA;
            this.strA = strA;
        }
        @Override
        public String toString() {
            return "A{" +
                    "strA='" + strA + '\'' +
                    ", intA=" + intA +
                    ", " + strStatic +

                    '}';
        }
    }
class B extends A{
    static String strStatic = "bStatic Инициализированно при объявлении";
    String strB;
    int intB;

    {
        System.out.println("B Анонимный блок инициализации");
        strB = "B в анонимном";
        intB = 33333;
    }

    static {
        System.out.println("B Статический блок инициализации");
        strStatic = "bStatic Инициализированно в статическом блоке";
    }

    B() {
        System.out.println("Конструктор B()");
    }

    B(int intB, String strB) {
        System.out.println("Конструктор B(int intB, String strB)");
        this.intB = intB;
        this.strB = strB;
    }

    @Override
    public String toString() {
        return "B{" +
                "strB='" + strB + '\'' +
                ", intB=" + intB +
                ", " + strStatic +

                '}';
    }
}


