package com.er;

import java.util.ArrayList;
import java.util.List;

public class TryMe {


    public static void main(String[] args)  {
        List<Integer> nums = new ArrayList<>(4);
        for (int i = 0; i < nums.size(); i++) {
            nums.add(i);
        }
        System.out.println(nums.size());
    }
}