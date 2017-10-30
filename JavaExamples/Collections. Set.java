/*
HashSet	Множество
TreeSet	Множество
SortedSet	Отсортированное множ.
public Iterator iterator()
public int size()
public boolean isEmpty()
public boolean contains(Object o)
public boolean add(Object o)
public boolean addAll(Collection c)
public Object[] toArray()
public boolean remove(Object o)
public boolean removeAll(Collection c)
public boolean retainAll(Collection c) - (retain — сохранить). Выполняет операцию "пересечение множеств".
public void clear()
public Object clone()
*/


public static void main(String[] args) throws Exception{
//Iterator for collections
HashSet<String> set = new HashSet<String>();
    set.add("");
    set.add("");
    set.add("");

for (String text : set){
        System.out.println(text);
		}
	//commands inside iterator	
    Iterator<String> iterator = set.iterator();//получение итератора для множества
    while (iterator.hasNext())        //проверка, есть ли ещё элементы   {
        String text = iterator.next();//получение текущего элемента и переход на следующий
        System.out.println(text);
    }
//удаление всех значений больше 10
        Iterator<Integer> iterator = set.iterator();//вызываем итератор
        while (iterator.hasNext()){
            //если значение больше 10, то удаляем и переходим к следующему
            if (iterator.next()>10) iterator.remove();
        }

        return set;
    }

// Set из котов	
	package com.javarush.test.level08.lesson11.home01;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
/*1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/
public class Solution
{
    public static void main(String[] args){
        Set<Cat> cats = createCats();		//создаем множество объектов, методом createCats
		
        Iterator<Cat> iter = cats.iterator();//удаляем один объект по параметру name
        while(iter.hasNext()){
            Cat s = iter.next();
            if(s.name.equals("Josef")){
                iter.remove();
            }
		}
        printCats(cats);					//выводим множество cats, методом printCats
    }

    public static Set<Cat> createCats(){	//метод для создания множества из объектов
     HashSet<Cat> set = new HashSet<>();
        set.add(new Cat("Josef"));
        set.add(new Cat("Master"));
        set.add(new Cat("Voland"));
        return set;
    }

    public static void printCats(Set<Cat> cats){ //метод печати объектов из множества
        for (Cat i : cats){
            System.out.println(i);
        }   
    }

    public static class Cat{ //создаем класс объекта с конструктором поля name
      String name;
      Cat(String name){
          this.name = name;
      }
    }
}
