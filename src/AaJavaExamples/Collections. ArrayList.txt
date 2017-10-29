/*
ArrayList	Список
LinkedList	Список
Vector	Вектор
Stack	Стек*/

Iterator<Integer> iterator = set.iterator();//итератор для удаления
        while (iterator.hasNext()){
            //если значение больше 10, то удаляем и переходим к следующему
            if (iterator.next()>10) iterator.remove();
        }
public static void main(String[] args)
{
//РАБОТА СО СТРОКАМИ	
	ArrayList<String> list = new ArrayList<String>();
	
	//Запись элемента в массив
	for (int i = 0; i < 3; i++){
		list.add("example");		//записывает строку в очередной индекс
		}	
		list.add(0, "new example");	//записывает строку в обозначеный индекс, сдвигая весь масив
		list.set(2, "new new");		//переписывает строку в индексе не изменяя размер массива.
	//ввод строк с клавиатуры
		for (int i = 0; i < 5; i++){
			list.add(reader.readLine());
		}
	//обращение к элементу массива/коллекции
		String s = list.get(4);	
	//удаление элемента массива
		list.remove (4);
	//количество элементов массива
		int n = list.size();	
	//длинна строки массива
		int m = list.get(0).length();	
	//вывод содержимого коллекции на экран в обратном порядке
		for (int i = 0; i < list.size(); i++){
			int j = list.size() - i - 1;
			System.out.println( list.get(j) );
		}
//РАБОТА С ЦЕЛЫМИ ЧИСЛАМИ	
	ArrayList<Integer> num = new ArrayList<Integer>(20);//можно задать изначальный объем массива
        for (int i = 0; i < 20; i++){
            num.add(Integer.parseInt(reader.readLine()));
        }
	//бесконечный цикл ввода чисел с клавиатуры		
}	while (true){
        String s = reader.readLine();
        if (s.isEmpty()) break;
        num.add(Integer.parseInt(s));
		}
	//удаляем все числа больше 5ти
	for (int i = 0; i < num.size(); ){  //убрали увеличение i внутрь цикла
        if (num.get(i) > 5)
            num.remove(i);  //не увеличиваем i, если удалили текущий  элемент  
        else
            i++;
		}
	//делим массив на чет и нечет
    int[] data = {1, 5, 6, 11, 3, 15, 7, 8}; 					//статическая инициализация массива 
	ArrayList<Integer> list = new ArrayList<Integer>(); 		//создание коллекции
    for (int i = 0; i < data.length; i++) list.add(data[i]);	//заполнение списка из массива

    ArrayList<Integer> even = new ArrayList<Integer>();  //массив чётные
    ArrayList<Integer> odd = new ArrayList<Integer>();    //массив нечётные

    for (int i = 0; i < list.size(); i++){
        Integer x = list.get(i);
        if (x % 2 == 0)    //если x - чётное
            even.add(x);   // добавляем x в коллекцию четных чисел  
        else
            odd.add(x);    // добавляем x в коллекцию нечетных чисел
		}
	//слияние списков
	ArrayList<Integer> list1 = new ArrayList<Integer>();   //создание списка  
    Collections.addAll(list1, 3, 7, 2, 12, 9, 78, 53, 22);   //заполнение списка
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

    ArrayList<Integer> result = new ArrayList<Integer>();
    result.addAll(list1);   //добавление всех значений из одного списка в другой
    result.addAll(list2);
	printCollection(result);
	
	public void printCollection (){
		for (Integer x : result){   //быстрый for по всем элементам, только для коллекций
			System.out.println(x);
			}	
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		