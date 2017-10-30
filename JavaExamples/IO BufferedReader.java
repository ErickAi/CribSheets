public class Home
{
    public static void main(String[] args)	
    {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
     String s = reader.readLine();
	 String sn = reader.readLine();
	 int n = Integer.parseInt(sn);
    }
}
//1	¬вод строки и числа с клавиатуры
/*- „тобы считать строку с клавиатуры, удобнее всего воспользоватьс€ объектом BufferedReader. 
Ќо дл€ этого в него нужно передать объект, из которого он будет вычитывать данные Ц System.in.

- Ќо System.in и BufferedReader не совместимы друг с другом, 
поэтому мы используем переходник Ц еще один объект InputStreamReader.
*/

public class Home
{
    public static void main(String[] args)	
    {
     InputStream inputStream = System.in; //объект System.in заносим в переменную входящийпоток и ее в одноименный объект
	 Reader inputStreamReader = new InputStreamReader(inputStream);
			//создаем новый объект ридер(входящегопотока) с параметрами вход€щийѕоток
	 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			//создаем объект Ѕуферный–идер с параметрами (входящегопотока) и заносим его в переменную буферный–идер
	 String name = bufferedReader.readLine(); //читаем строку с клавиатуры
	 String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
	 int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.
    }
}

//2	Ѕолее компактна€ запись первой части:
public class Home
{
    public static void main(String[] args)	
    {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
     String name = reader.readLine();
	 String sAge = reader.readLine();
	 int nAge = Integer.parseInt(sAge);
    }
}

//3	≈ще более компактная. но сканером пользоватьс€ буду очень редко.
public class Home
{
    public static void main(String[] args)	
    {
     Scanner scanner = new Scanner(System.in);
	 String name = scanner.nextLine();
	 int age = scanner.nextInt();
    }
}



