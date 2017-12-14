package com.er;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryMe {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        long nach;
        long res = 0;
        if (n < 0) {
            return String.valueOf(res);
        }
        if (n<=150) {
            res+=1;
            if (n!=0) {
                for (int i = 1; i <= n; i++) {
                    nach = res * i;
                    res = nach;
                }
                return String.valueOf(res);
            }
        }

        return String.valueOf(res);
    }
    }
