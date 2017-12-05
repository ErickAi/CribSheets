package OOP.generics;


public class SimplePairT<T1, T2>  {
        private T1 object1;
        private T2 object2;

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

    public static void main(String[] args) {
        SimplePairT<Integer, String> pair = new SimplePairT<>(6, " Apr");
        System.out.println(pair.getFirst() + pair.getSecond());
    }
}
