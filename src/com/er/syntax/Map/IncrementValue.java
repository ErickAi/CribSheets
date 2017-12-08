package com.er.syntax.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Erick on 15.06.2017.
 */
public class IncrementValue {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = "qwerqwerqwer".toCharArray();

        //Инкрементирование Value если Key уже присутствует в Map
/*        for (char c : chars) {
            Integer value = strintHashMap.get(c);
            strintHashMap.put (c, value==null ? 1 : value+1);
        }
            if (!map.containsKey(c))
                map.put(c, 0);
                map.put(c, data.get(key) + 1);
        }
*/
        for (char c : chars){
           // Integer value = map.getOrDefault(c,0);
            map.put(c,(map.getOrDefault(c,0) + 1));
        }

        map.computeIfPresent('q', (key,value) -> 22);
        map.computeIfPresent('a', (key,value) -> 22);
        map.computeIfAbsent('q', Integer::new);
        map.computeIfAbsent('s', Integer::new);

        for(Map.Entry<Character,Integer> entry: map.entrySet()) {
            /*
            Character key = entry.getKey();         //получить ключ
            Integer value = entry.getValue();       //получить значение
            System.out.println("key "+key+" fricuency= "+value);
            */
            System.out.println("key " + entry.getKey() + " fricuency= " + entry.getValue());
        }

    }
}


