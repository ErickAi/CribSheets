package com.er.syntax.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Erick on 15.06.2017.
 */
public class MapToList {

    public static void main(String[] args) {
        MapToList thisClass = new MapToList();
        Map<String, Integer> strintHashMap = new HashMap<>();
            strintHashMap.put("JJ",1);
            strintHashMap.put("Alice",2);
            strintHashMap.put("Rob",3);
            strintHashMap.put("Joe Cocker",11);
            strintHashMap.put("ff",12);

        //Обращение Map в List
        List keyList = new ArrayList(strintHashMap.keySet());       //лист<Original Object> ключей
        List valueList = new ArrayList(strintHashMap.values());     //лист<Original Object> значений
        List entryList = new ArrayList(strintHashMap.entrySet());   //лист<HashMap> ключ-значения

        thisClass.printList (keyList);
        thisClass.printList(valueList);
        thisClass.printList(entryList);
    }
    public void printList (List list){
        for (Object l : list){
            System.out.println(l.getClass()+" "+l);
        }
        System.out.println();
    }
}