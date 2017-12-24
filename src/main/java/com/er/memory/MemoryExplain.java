package com.er.memory;

import java.util.Arrays;
import java.util.List;

public class MemoryExplain {                //загружается класслоудером в PermGen
    public static final int CONST_INT = 3;  //в PermGen как поле класса
    private int prim;                       //в Heap в " " объекта как значение
    private int[] arr;                      //в Heap в " " объекта как ссылка на массив значений
    List<POJO> list;                        //в Heap в " " объекта как ссылка на контейнер ссылок на объекты

    public static void main(String[] args) {
        MemoryExplain ob = new MemoryExplain(CONST_INT);
        ob.arr[0] = 100;
        System.out.println(Arrays.toString(ob.arr));
        ob.arr = new int[2];
        System.out.println(Arrays.toString(ob.arr));

    }
    public MemoryExplain(int prim) {
        this.prim = prim;
        this.arr = new int[]{10,20,30};
        list = addPOJO(new POJO(), new POJO());
        System.out.println("Constructor " + prim +" "+ Arrays.toString(arr));
    }

    public List<POJO> addPOJO(POJO... pojos) {
        prim = pojos.length;
        System.out.println("addPOJO " + prim +" "+ Arrays.toString(pojos));
        return Arrays.asList(pojos);
    }
}

class POJO {
    public static final String CONST_STR = "Constance String";//в PermGen как поле класса
    public static int counter = 0;
}
