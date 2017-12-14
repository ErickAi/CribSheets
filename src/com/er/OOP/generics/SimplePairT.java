package com.er.OOP.generics;


public class SimplePairT<T1, T2>  {
        private T1 object1;
        private T2 object2;

    public SimplePairT() {
    }
    private SimplePairT(T1 one, T2 two) {
        object1 = one;
        object2 = two;
    }

    private T1 getFirst() {
        return object1;
    }
    private T2 getSecond() {
        return object2;
    }
    public void setObject1(T1 object1) {
        this.object1 = object1;
    }
    public void setObject2(T2 object2) {
        this.object2 = object2;
    }

    public static void main(String[] args) {
        SimplePairT<Integer, String> pair1 = new SimplePairT<>(6, "Apr");
        System.out.println(pair1.toString());

        SimplePairT<StringBuilder, Double> pair2 = new SimplePairT<>();
        pair2.setObject1(new StringBuilder("ABC"));
        pair2.setObject2(2d);
        System.out.println(pair2.toString());
    }

    @Override
    public String toString() {
        return "SimplePairT{" +
                "object1= " + object1 +
                ", object2= " + object2 +
                '}';
    }
}
