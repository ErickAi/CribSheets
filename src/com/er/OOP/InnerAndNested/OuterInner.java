package com.er.OOP.InnerAndNested;

public class OuterInner {

    private int i, j;
    private static int x;

    OuterInner(int i, int j, int x){
        this.i = i; this.j = j; this.x = x;
    }

    class Inner{
        private int iI, jJ;
//      private static int xX; Inner classes cannot have static context

        private int summAll(int i,int j){
            return i+j+iI+jJ+x;
        }
    }

    public static void main(String[] args) {
        OuterInner outerObject = new OuterInner(3,7,1);
        OuterInner.Inner innerObject = outerObject.new Inner();
    }
}
