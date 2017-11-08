break, continue, return
extends, implements
instanceof

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	

//ИТЕРАТОР ДЛЯ Map
for (Map.Entry entry : properties.entrySet()){
    System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
Iterator<Integer> iterator = set.iterator();//итератор для удаления
while (iterator.hasNext()){
    //если значение больше 10, то удаляем и переходим к следующему
    if (iterator.next()>10) iterator.remove();
}	

//ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
&&	AND	(и) 	||	OR 	(или)		!	NOT	(не)
return a < b ? a : b; //если a < b тру - вернуть а. иначе - b.	

//Распространённые комбинации и выражения	
m && !m			false
m || !m			true
! (a && b)		!a || !b
! (a || b)		!a && !b
	 
//Escape-исключения
\t	Табуляция.
\b	Клавишу Backspace.
\n	Новую строку.
\r	Возврат каретки.
\f	Перевод формата.
\'	Одинарной кавычки.
\"	Двойной кавычки.
\\	Наклонной черты влево.

//String.format
%s	String
%d	целое число: int, long, …/td>
%f	вещественное число: float, double
%b	boolean
%c	char
%t	Date
%%	Символ %

"%3$s %4$s %2$s %1$s", "four", "three", "one", "two"