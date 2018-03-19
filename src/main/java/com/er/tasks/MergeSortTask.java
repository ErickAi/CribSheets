package com.er.tasks;

import java.util.Arrays;

/*
Задача
Функция сортирующая массив элементов A:
Sort(A,from,length)
1 if from < length
2    then           middle := round_half_down((from+length)/2)
3                       Sort(A,from,middle)
4                       Sort(A,middle+1,length)
5                       Merge(A,from,middle,length)
Пример массива:
A = (5,2,4,6,1,3,2,6)

Примера запуска:
Sort(A,1,length[A])
 */
public class MergeSortTask {
    private static int[] sort(int[] arr, int minSize, int length) {
        if (length < 2) return arr;
        int middle = (minSize + length) / 2;
            sort(arr, minSize, middle);
            sort(arr, middle, length);

        return merge(arr, minSize, middle, length);
    }

    private static int[] merge(int[] arr, int minSize, int middle, int length) {
        int[] result = new int[length];
        int a = 0, b = middle;
        for (int i = 0; i < length; i++) {
            if (b < length && a < middle) {
                if (arr[a] > arr[b]) result[i] = arr[b++];
                else result[i] = arr[a++];
            } else if (b < length) {
                result[i] = arr[b++];
            } else {
                result[i] = arr[a++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 5, 9, 4, 1};
        sort(arr, 1, arr.length);
        System.out.println(arr.toString());
    }
    /*        int len_1 = arr_1.length, len_2 = arr_2.length;
        int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
                else result[i] = arr_1[a++];
            } else if (b < len_2) {
                result[i] = arr_2[b++];
            } else {
                result[i] = arr_1[a++];
            }
        }
        return result;
    */
}