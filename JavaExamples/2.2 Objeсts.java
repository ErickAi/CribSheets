public class Home
{
    public static void main(String[] args)	//неизменяемая часть. каждый класс начинается с этой строки
    {
     Cat cat;	//Объявляет ссылочную переменную с именем cat и типом Cat. Значение переменной cat – ссылка null.
	 new Cat();	//Создаёт объект типа Cat. 
	 Cat cat = new Cat();	//то же самое, но короче.
    }
}

public class Home
{
    public static void main(String[] args)	
    {
	 Cat murzik = new Cat();
	 Cat vaska = new Cat();	//Создаются два объекта, ссылки на которые присваиваются двум разным переменным. 
	 vaska = murzik;		//переменной vaska присваивается ссылка на объект, содержащийся в переменной murzik.
	 /*Теперь обе переменных ссылаются на первый созданный объект. 
	 (На второй больше никто не ссылается – второй объект считается мусором)*/
	 }
}

public class Home
{
    public static void main(String[] args)	
    {
     Cat murzik = new Cat(); 	//Создаётся один объект типа Cat, ссылка на который заносится в первую переменную (murzik)
	 Cat vaska = null;			//вторая переменная (vaska) содержит пустую (нулевую) ссылку.
	 vaska = murzik;			//Обе переменных ссылаются на один объект.
	 murzik = null;				//Теперь только vaska ссылается на объект, но не murzik.
    }
}

