package com.er;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Class45 {
}

class M {
    public Map<Integer, Integer> map = new HashMap<>();
    public int get(int key) {
        return map.get(key);
    }
    public void set(int key, Object value) {
//        map.put(key, value);                  //this
    }
}
class S {
    public Set<Long> set = new HashSet<>();
//    public long get(long index){
//        return set.get(index);                //this
//    }
    public void put(int value) {
//        set.put(value);                       //this
//        set.add(value);                       //this
    }
}
