Date
{//constructors & methods
//Date предназначен для работы с текущими датой и временем и позволяет отталкиваться от них для решения своих задач. 
//При выходе новых версий Java часть методов класса была перемещена в классы Calendar и DateFormat.

//конструкторы. рабочих всего 2. остальные deprecated
Date()			//по умолчанию. создает и устанавливает текущую дату
Date(long date)	//устанавливает дату согласно параметру long.

//методы. много, но большинство deprecated
boolean	equals(Object object)//если даты совпадают, то возвращается true
boolean	after(Date date)	//если объект содержит более позднюю дату, чем в параметре, возвращается true
boolean	before(Date date)	//... более раннюю дату...
int compareTo(Date date)	//сравнивает даты. Возвращает 0, если совпадают, 
			//отрицательное значение - если вызывающая дата более ранняя, 
			//положительное значение - если вызывающая дата более поздняя, чем в параметре
long 	getTime()				//возвращает количество миллисекунд, прошедших с полуночи 1 января 1970 года
void 	setTime(long milliseconds)	//устанавливает время и дату в виде числа миллисекунд...
Object	clone()				//возвращает копию this Object
int		hashCode()			//Returns a hash code value for this object.
Instant	toInstant()			//Converts this Date object to an Instant.
String	toString()			//Converts this Date object to a String of the form:
}

