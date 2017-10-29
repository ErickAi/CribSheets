package syntax.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Erick on 15.06.2017.
 */
public class IncrementValue {

    public static void main(String[] args) {
        Map<Character, Integer> strintHashMap = new HashMap<>();

        char[] chars = "ghivycrthfvgbinlilubygthdxgdxcvhbuybtryewzeredtfguyhlifdsaw".toCharArray();

        //Инкрементирование Value если Key уже присутствует в Map
        for (char c : chars) {
            Integer value = strintHashMap.get(c);
            strintHashMap.put (c, value==null ? 1 : value+1);
        }
        for(Map.Entry<Character,Integer> entry: strintHashMap.entrySet()) {
            /*
            Character key = entry.getKey();         //получить ключ
            Integer value = entry.getValue();       //получить значение
            System.out.println("key "+key+" fricuency= "+value);
            */
            System.out.println("key " + entry.getKey() + " fricuency= " + entry.getValue());
        }

    }
    public void printMap (Map map){
    }
}


