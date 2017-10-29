//Операторы перехода 
break, continue, return

switch (month) {
    case 1:  monthString = "Январь";
    break;
    default: monthString = "Не знаем такого";
             break;
}

//foreach для коллекций
for (Integer x : result){   			//Для каждого (Объекта х : коллекции result)
			System.out.println(x);		//Вывести на экран (х)
			}	
//итератор мапы
for (Map.Entry entry : properties.entrySet()){
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
//итератор удалятель
Iterator<String> iter = arr.iterator();
while(iter.hasNext()){
			String next = iter.next();
			if(next.startsWith("bla"))
				iter.remove();
		}	

int i = 3;
while (i >= 0){
    System.out.println(i);
    i--;
}

/*бесконечный цикл пока не будет введена строка "exit".*/
boolean isExit = false;
while (!isExit){
    String s = buffer.readLine();
    isExit = s.equals("exit");
}//or
for (boolean isExit = false; !isExit; ){
    String s = buffer.readLine();
    isExit = s.equals("exit");
}

//----------------------------------------
/*бесконечный цикл пока не будет введена строка "exit".*/
for (; true; ){
    String s = buffer.readLine();
    if (s.equals("exit"))
        break;    
}//or
while (true){
    String s = buffer.readLine();
    if (s.equals("exit")) 
        break;
}
//----------------------------------------
for (; true; )
    System.out.println("C");
//or
while (true)
    System.out.println("C");
//----------------------------------------
//оператор switch
int month = 3;
String monthString;
switch (month) {
    case 1:  monthString = "Январь";
             break;
    case 2:  monthString = "Февраль";
             break;
    //...
    case 12: monthString = "Декабрь";
             break;
    default: monthString = "Не знаем такого";
             break;
}