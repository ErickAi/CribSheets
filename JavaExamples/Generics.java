//Generics
//MyClass<T extends Animal<T>> implements Comparable<T>---------|
public class TypeExtension {
    public static void main(String[] args) {
        Animal dog = new Dog ("Пес");
        Animal cat = new Cat ("Кот");
        cat.subCompare(dog);
    }
}
abstract class Animal<T extends Animal<T>> implements Comparable<T>{
    @Override
    public int compareTo(Animal o) {return 0;}
    abstract void subCompare(T a);
}
class Dog extends Animal<Dog> {
    @Override
    void subCompare(Dog a) {}
}
class Cat extends Animal<Cat> {
    @Override
    void subCompare(Cat a) {}
}
//Simple extending Types. extend vs super---------------------------------------------|
String        extends Object
List<String> !extends List<Object>
List<String>  extends Collection<String>
public class Container <T extends Product> {
    //Classes: Abstract Product, Phone/Camera extends Product, Car
    public static void main(String[] args) {
        Container<Product> products = new Container<>();
        Container<Phone> phones = new Container<>();
        //Container<Car> cars = new Container<Car>();//Compile Error: Type parameter Car is not whithin its bound
        List<Camera> cams = new ArrayList<>();
        List<Object> objs = new ArrayList<>();
        products.findIt(new ArrayList<Camera>(), new Phone("Nokia"));
        //products.find(new ArrayList<Camera>(), new Phone("Nokia")); //Compile Error:
        products.copy(cams, objs);

    }

    boolean findIt (List<? extends Product> all, Product p){
        return all.contains(p);
    }
    <E extends Product> boolean find(List<E> all, E p){
        return all.contains(p);
    }
    void copy(List<? extends Product> src, List<? super Product> dest){
        dest.addAll(src);
        }
}
//Сырые типы и настоятельная типизация------------------------------------------------|
public class RawType<T> {

    public static void main(String[] args) {
        List rawList = new ArrayList();
        List<String> list = new ArrayList<>();
        rawList = list;
        list = rawList;         				//Compiling warning: Unchecked assignment

        List<String> listStr = Arrays.asList("value");

        RawType rawType = new RawType();		//Типизированный тип лучше типизировать...
        rawType.testRow(listStr);				//ClassCastException: String cannot be cast to Integer

        RawType<?> someType = new RawType<>();	//...любым типом
        someType.testRow(listStr);				//все нормально
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
//------------------------------------------------------------------------------------|
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

