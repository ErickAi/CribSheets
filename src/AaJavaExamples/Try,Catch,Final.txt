/*типы исключений в пакете java.lang.:
RuntimeException e					общий класс исключений
ArithmeticException e				арифметические
NumberFormatException				числовые
NullPointerException e				строковые
ArrayIndexOutOfBoundsException e	массивы
IndexOutOfBoundsException			коллекции List
NullPointerException				коллекции Map
FileNotFoundException
URISyntaxException
*/
//перехват выборочных исключений: task09.task0915
public class Solution {
    public static void main(String[] args) throws Exception {
	
		try {
			int a = 42 / 0;
		}
		catch (RuntimeException e){
			System.out.println(e);
		}
		System.out.println(e.toString());
			System.out.println(e.getMessage());
    }
}