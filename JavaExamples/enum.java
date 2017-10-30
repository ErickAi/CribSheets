public enum Direction			//public final class Direction extends java.lang.Enum
{								//{
 UP, 							//public static final Direction UP = new Direction(); 
DOWN,							//public static final Direction DOWN = new Direction();
LEFT,							//public static final Direction LEFT = new Direction();
RIGHT,							//public static final Direction RIGHT = new Direction();
}								//private Direction(String name, int ordinal) {} //приватный конструктор
								//}
Direction direction = Direction.LEFT;

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
