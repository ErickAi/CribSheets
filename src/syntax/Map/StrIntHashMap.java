package syntax.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Erick on 15.06.2017.
 */
public class StrIntHashMap {
    static Map<String, Integer> strintHashMap = new HashMap<>();
    static {
        strintHashMap.put("JJ",1);
        strintHashMap.put("Alice",2);
        strintHashMap.put("Rob",3);
        strintHashMap.put("Joe Cocker",11);
        strintHashMap.put("ff",12);
    }

    public static void main(String[] args) {
        //Обращение Map в List
        List keyList = new ArrayList(strintHashMap.keySet());       //лист<Original Object> ключей
        List valueList = new ArrayList(strintHashMap.values());     //лист<Original Object> значений
        List entryList = new ArrayList(strintHashMap.entrySet());   //лист<HashMap> ключ-значения

        printList (keyList);
        printList(valueList);
        printList(entryList);
    }
    public static void printList (List list){
        for (Object l : list){
            System.out.println(l.getClass()+" "+l);
        }
        System.out.println();
    }
}
