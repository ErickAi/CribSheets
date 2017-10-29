package OOP.InnerAndNested;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonComparator {
    public static void main(String args[]) {

// создать ArrayList и добавить в него несколько объектов Integer
        List<Integer> list = new ArrayList<>();
        list.add(37);
        list.add(-59);
        list.add(83);

// отсортировать список обычным способом (по возрастанию)
        Collections.sort(list);
        System.out.println(list);

// отсортировать список по убыванию, кастомным компаратором
// используя функцию, реализованную объектом при помощи анонимного класса
/*
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                int a = ((Integer) o1).intValue();
                int b = ((Integer) o2).intValue();
                return a < b ? 1 : a == b ? 0 : -1;
            }
        });
*//*
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        Collections.sort(list, comp);
        System.out.println(list);
*/
        Comparator<Integer> comp = (o1, o2) -> o2 - o1;
        list.sort(comp);
        System.out.println(list);
    }
}

