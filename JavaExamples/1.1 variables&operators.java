//ПЕРЕМЕННЫЕ 

Type		deafult		value				description
byte	1	0			-128 .. 127			Самое маленькое целое — один байт
short	2	0			-32,768 .. 32,767	Короткое целое, два байта
int		4	0			— 2*109 .. 2*109	Целое число, 4 байта
long	8	0L			— 9*1018 .. 9*1018	Длинное целое, 8 байт
float	4	0.0f		-10127 .. 10127		Дробное, 4 байта
double	8	0.0d		-101023 .. 101023	Дробное, двойной длины, 8 байт
boolean	1	false		true, false			Логический тип (только true & false)
char	2	‘\u0000‘	0..65,535			Символы, 2 байта, все больше 0
Object	4	null		Любая ссылка		Хранит ссылки на объекты типа Object или классов наследников

//ОПЕРАТОРЫ
double a4 = 14.0 / 5.0; //результат равен 2.8
double a5 = 14.0 % 5.0; //результат равен 4
int b1 = 5;
int c1 = ++b1; // c1=6; b1=6
int b2 = 5;
int c2 = b2++; // c2=5; b2=6
int b3 = 5;
int c3 = --b3; // c3=4; b3=4
int b4 = 5;
int c4 = b4--; // c4=5; b4=4
int x += 5	//переменной х присваивается значение х+5

//ЛОГИЧЕСКИЕ ОПЕРАТОРЫ
&&	AND	(и) 	и  /и  /только оба			конъюнкция	логическое умножение
||	OR 	(или)	или/или/или оба сразу		дизъюнкция	логическое сложение		
!	NOT	(не)
return a < b ? a : b; //если a < b тру - вернуть а. иначе - b.		

//Распространённые комбинации и выражения
Операцию И часто называют "логическим умножением", а ИЛИ "логическим сложением"
								    И			   ИЛИ			 НЕ
m && !m			false			0 * 0 = 0		0 + 0 = 0		0	1
m || !m			true			0 * 1 = 0		0 + 1 = 1		1	0
! (a && b)		!a || !b		1 * 0 = 0		1 + 0 = 1
! (a || b)		!a && !b		1 * 1 = 1		1 + 1 = 1

boolean m;	
boolean m = false;
//Два данных выражения эквивалентны. Значение переменой типа boolean по умолчанию false («ложь»).

if (a > b) 
    System.out.println(a);
boolean m = (a > b);
if (m == true) 		/*Не нужно сравнивать логическую переменную (типа boolean) c true или false.
					Результат сравнения сам будет иметь тип boolean, 
					и в точности будет совпадать со значением сравниваемой переменой:*/
if (m) 						//В переменную m будет записан результат сравнения – true или false.
    System.out.println(a);	//Условие выполняется, если переданное в него выражение истинно – true.


public boolean  isALessThenB (int a, int b){			
    return a < b;
}

//ниже приведены три эквивалентных записи сравнения. 
public boolean isALessThenB (int a, int b){
    if (a < b)
        return true;
    else 
        return false;
}

public boolean isALessThenB (int a, int b){
    boolean m = (a < b);
    if (m)
        return true;
    else 
        return false;
}

public boolean isALessThenB (int a, int b){
    boolean m = (a < b);
    return m;
}

//ЛОГИЧЕСКИЕ ОПЕРАТОРЫ 
//AND (и) &&	
true && true	true
true && false	false
false && true	false
false && false	false
//OR (или)	||	
true || true	true
true || false	true
false || true	true
false || false	false
//NOT(не)	!	
! true			false
! false			true


//Распространённые комбинации и выражения	
m && !m			false
m || !m			true
! (a && b)		!a || !b
! (a || b)		!a && !b

//for examle
// java					логическое				пояснение
(a<3) && (a>0)		(a < 3) AND (a>0)			a<3 и a>0
(a>10)|| (a<100)	(a>10) OR (a<100)		a>10 или a<100
(a<b)&& (!(c<=d))	(a<b) AND (NOT (c<=d))	a<b и (не (c<=d))
