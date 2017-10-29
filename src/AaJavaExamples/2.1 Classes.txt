extends implements super
if (o instanceof Solution.Cat){
               System.out.println("Кошка");
class Book{
	public String name;
	public String author;
    public int year;
     
    Book(){ 
	//Первый конструктор без параметров присваивает неопределенные начальные значения полям.
        name = "неизвестно";
        author = "неизвестно";
        year = 0;
    }
	 
    Book(String name, String author){
    //Второй конструктор присваивает полям класса значения, которые передаются через его параметры.    
        this.name = name;
        this.author = author;
        /*this - ключевое слово. Представляет ссылку на текущий объект.
		this.name - поле текущего класса. 
		Переменной "name" класса "Book" присваивается параметр "name" переданный при обращении к классу*/
    }
    
	Book(String name, String author, int year){
    //Третий конструктор, для установки разного количества параметров. Можно вызывать один конструктор из другого.     
        this(name, author);
        this.year = year;
    }
    public void Info(){
	//метод, который выводит значения этих переменных
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);
    } 
	//или можно переопределить метод 
	@Override
    public String toString() {
    return "Книга " + name " (автор) " + author " была издана в " + year + " году";
    }
	
}

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

