//Generics
//------------------------------------------------------------------------------------|
String        extends Object
List<String> !extends List<Object>
List<String>  extends Collection<String>

public class RawType<T> {

    public static void main(String[] args) {
        List rawList = new ArrayList();
        List<String> list = new ArrayList<>();
        rawList = list;
        list = rawList;         //Unchecked assignment

        List<String> listStr = Arrays.asList("value");

        RawType rawType = new RawType();                //Типизированный тип лучше типизировать...
//        rawType.testRow(listStr);                       //ClassCastException: String cannot be cast to Integer

        RawType<?> someType = new RawType<>();          //...любым типом
        someType.testRow(listStr);                      //все нормально
    }

    public <E> void testRow (Collection<E> collection){
        for (E e : collection) {
            System.out.println(e);
        }
    }
    public void testRow (List<Integer> intList){
        for (Integer i : intList) {
            System.out.println(i);
        }
    }

	public class Solution <T extends List<Solution.SomeClass>> {
		public static  class  SomeClass <T extends Number> {
    }}
	
	public static <T> T someStaticMethod(Object genericObject) {
        System.out.println(genericObject);
        return (T) genericObject;
    }
public class SimplePairT<T1, T2>  {
        private T1 object1;
        private T2 object2;

    private SimplePairT(T1 one, T2 two) {
        object1 = one;
        object2 = two;}

    private T1 getFirst() {
        return object1;}

    private T2 getSecond() {
        return object2;}

    public static void main(String[] args) {
        SimplePairT<Integer, String> pair = new SimplePairT<>(6, " Apr");
        System.out.println(pair.getFirst() + pair.getSecond());}
}
static void printList(List<?> list) 

List<? extends Number> numList = new ArrayList<Integer>(); 
numList = new ArrayList<String>(); 

