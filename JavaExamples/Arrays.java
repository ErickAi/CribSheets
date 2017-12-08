
Array int[] intArray = {1,2,4,5,6,7};
List<?> list = new ArrayList;

list.addAll(Arrays.asList(array));		//из массива в лист
int[] nums = (int[]) list.toArray;		//из листа в массив
int[] bams = Arrays.copyOf(intArray)	//из массива в массив
int[] bams = Arrays.copyOf(intArray, [размер создаваемого массива])
System.arraycopy(other, 	0, 			array, 	1, 			other.length);
			//	(откуда,	с элемента,	куда,	с элемента,	длинна)	
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class MainClass
{
    public static void main(String[] args) 
    {
	//Заполнение массива из 10 чисел, числами от 1 до 10
        int[] num = new int[10];
        for (int i = 0; i < numbers.length; i++)
        {
           num[i] = i + 1;
        }
		
	//Ввод 10 строк с клавиатуры	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] list = new String[10];
		for (int i = 0; i < list.length; i++)
		{
		list[i] = reader.readLine();
		}
	
	//Ввод 10 чисел с клавиатуры
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
		{
		arr[i] = Integer.parseInt(reader.readLine());
		}
		
	//вывод на экран
        for (int i = 0; i < list.length; i++)  
			System.out.println(list[i]);
		for (int i = 0; i < num.length; i++) 
			System.out.println(numbers[i]);
		for (int i = 0; i < arr.length; i++) 
			System.out.println(arr[i]);
		
	//пузырьковая сортировка по возрастанию
		for (int i=arr.length-1; i>0; i--){ //внешний цикл сокращает фрагмент массива в каждой итерации т.к...
			for (int j=0; j<i; j++){//т.к. внутренний цикл ставит максимальное значение в конец массива
			//сравниваем элементы попарно, если нужно, меняем местами
				if (arr[j] > arr[j+1]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	//копирование массива/части массива
		int [] toHalf = Arrays.copyOf(arr,5);//с начала до середины
        int [] fromHalf = Arrays.copyOfRange(arr, arr.length - 5, arr.length);//с середины до конца

	//инвертировать массив
		for (int i = 0; i <num.length/2; i++){
			int tmp = num[i];
			num [i] = num [num.length-i-1];
			num [num.length-i-1] = tmp;
			}
	//вывести массив в обратном порядке
		for (int i = 0; i < list.length; i++){
			int j = list.length - i - 1;
			System.out.println( list[j] );

    //это статическая инициализация
        int[] listStat = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};        
        
        //подсчёт суммы элементов
        int sum = 0;
        for (int i = 0; i < listStat.length; i++) 
           sum += listStat[i];

        System.out.println("Sum is " + sum);
    }	
		//Поиск минимального элемента в массиве
		int min = listStat[0];
        for (int i = 1; i < listStat.length; i++)
        {
             if (listStat[i] < min) 
                  min = listStat[i];
        }

       System.out.println ("Min is " + min);
}