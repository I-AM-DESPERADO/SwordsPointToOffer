package com.tz.SortTest;

/**
 * create by tz on 2018-07-05
 */
public class BubbleSort {
    private static void bubbleSort(int[] num) {
        int temp = 0;
        int size = num.length;
        for(int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size-1-i; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1,3,3,4,7,8,9,12,22,65,12,8,9};
        bubbleSort(num);
        for (int a : num) {
            System.out.println(a);
        }
    }
}
