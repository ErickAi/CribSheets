public enum Direction			//public abstract final class Direction extends java.lang.Enum
{								//
UP, 							//public static final Direction UP = new Direction("UP",nextOrdinal); 
DOWN,							//объект DOWN потомок класса Direction потомок класса Enum
LEFT,							//
RIGHT,							//
}								//private Direction(String name, int ordinal) {} //приватный конструктор
								//}
Direction left = Direction.LEFT;

Direction[] array = Direction.values();	//возвращает массив значений enum’а
int index = direction.ordinal();		//возвращает индекс значения в массиве
int leftIndex = Direction.LEFT.ordinal();
Direction left = array[leftIndex];

for (Direction direction : Direction.values()){
 System.out.println(direction);
}
String left = Direction.LEFT.toString(); 			// left == "LEFT";
Direction direction = Direction.valueOf("LEFT");	//Преобразование строки в enum:
Direction direction = Direction.valueOf("OUTSIDE");	//Exception

    private String columnName;              //поле класса каждого Column объекта присутствующего в енуме
  //boolean isFound;                        //это поле создается в методе configureColumns

  //собственно класс Енум
  public abstract class Enum<E extends Enum<E>>
        implements Comparable<E>, Serializable {
	private final String name;
    private final int ordinal;

   protected Enum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }
    public final String name() {
        return name;
    }
    public String toString() {
        return name;
    }
    public final int ordinal() {
        return ordinal;
    }

    //public final boolean equals(Object other)
    //public final int hashCode() 
    protected final Object clone() throws CloneNotSupportedException 
    public final int compareTo(E o) 
    
	@SuppressWarnings("unchecked")
    public final Class<E> getDeclaringClass() {
        Class<?> clazz = getClass();
        Class<?> zuper = clazz.getSuperclass();
        return (zuper == Enum.class) ? (Class<E>)clazz : (Class<E>)zuper;
    }
    public static <T extends Enum<T>> T valueOf(Class<T> enumType,
                                                String name) {
        T result = enumType.enumConstantDirectory().get(name);
        if (result != null)
            return result;
        if (name == null)
            throw new NullPointerException("Name is null");
        throw new IllegalArgumentException(
            "No enum constant " + enumType.getCanonicalName() + "." + name);
    }

    protected final void finalize() { }
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    private void readObjectNoData() throws ObjectStreamException 
}