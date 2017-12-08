package com.er.OOP.InnerAndNested;

public class OuterNested {
//Польза данных классов заключается в основном в логической группировке сущностей,
//в улучшении инкапсуляции, а также в экономии class-space.
//тестирование приватных статических методов
    private int i, j;
    private static int x;
    OuterNested(int i, int j, int x){
        this.i = i; this.j = j; this.x = x;
    }
    static class Nested{
        private int iI, jJ;
        private static int xX; //Inner classes can have static context

        private int summAll(int i,int j){
            return i+j+iI+jJ+xX;
        }
    }

    public static void main(String[] args) {
        OuterNested outer = new OuterNested(3,5,1);
        //int summ = OuterNested.Nested.summAll(i,j);
        OuterNested.Nested nestedObject = new OuterNested.Nested();
    }
}
