package com.er.memory;

import java.time.LocalTime;
import java.util.*;

public class GC {
    private static long counter = 0;
    GC(){
        counter ++;
    }
    public static void main(String[] args) {
        Set<GC> gc = new HashSet<>();
        long start = System.currentTimeMillis();
        long end;
        while (true){
            GC g = new GC();
            gc.add(g);  
//            if (counter%1000000000==0){
            if (counter%1000000==0){
                end = System.currentTimeMillis();
                System.out.println(measure(start, end));
                start = end;
                System.out.println(gc.size());
//                System.out.println(counter);
            }
        }
    }
    private static long measure(long start, long end){
        return end-start;
    }

}
