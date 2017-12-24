package com.er.memory.softCache;

/* 
Кеш на основании SoftReference
*/

import java.util.Calendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        SoftCache<AnyObject> cache = new SoftCache<>();

        for (long i = 0; i < 2_500_000; i++) {
            cache.put(i, new AnyObject(i, null, null));
            if(i%100000==0){
                System.out.println(i + " " + cache.get(i).getCreationTime().getSeconds());
            }
        }
        System.out.println(cache.getMapSize());
    }
}