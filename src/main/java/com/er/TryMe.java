package com.er;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class TryMe {
    int i;

    public TryMe(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        TryMe.class.getAnnotations();
        (new TryMe(2)).getClass().getAnnotations();
        int a = (byte) (-128 - 1);
        System.out.println(a);
        int[] j = {};
        //System.arraycopy(j,);
        System.out.println(1>1 ? "more" : "less");
        Integer x = null;
        int z = x;
        System.out.println(z);
    }

}

