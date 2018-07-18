package com.tz.SortTest;

/**
 * create by tz on 2018-07-05
 */
public class InsertSort {
    public static void insertSort(int[] num) {
        int size = num.length;
        int temp = 0;
        int j = 0;
        for (int i = 0; i < size; i++) {
            temp = num[i];
            for (j = i; j>0 && temp < num[j - 1]; j--) {
                num[j] = num[j-1];
            }
            num[j] = temp;
        }

    }

    public static void main(String[] args) {
        int[] num = {1,3,3,4,7,8,9,12,22,65,12,8,9};
        insertSort(num);
        for (int a : num) {
            System.out.println(a);
        }
    }
}
