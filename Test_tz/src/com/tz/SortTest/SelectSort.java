package com.tz.SortTest;

/**
 * create by tz on 2018-07-05
 */
public class SelectSort {

    private static void selectSort(int[] num) {
        int size = num.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            int k = i;
            for (int j = size - 1; j > i; j--) {
                if (num[j] < num[k])
                    k = j;
            }
            temp = num[i];
            num[i] = num[k];
            num[k] = temp;
        }
    }

    public static void main(String[] args) {
        int[] num = {1,3,3,4,7,8,9,12,22,65,12,8,9};
        selectSort(num);
        for (int a : num) {
            System.out.println(a);
        }
    }

}
