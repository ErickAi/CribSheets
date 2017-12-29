package com.er;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class TryMe {
    int i;
    String s;
    String n;

    public TryMe(int i, String s, String n) {
        this.i = i;
        this.s = s;
        this.n = n;
    }

    @Override
    public String toString() {
        return "TryMe{" +
                "i=" + i +
                ", s='" + s + '\'' +
                ", n='" + n + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new TryMe(5,"string","none"));
    }

}

