package com.tz.SortTest;

/**
 * create by tz on 2018-07-05
 */
public class QuickSort {
    private static int getMiddle(int[] num, int low, int high) {

        int temp = num[low];
        while (low < high) {
            while (low < high && num[high] > temp) {
                high--;
            }
            num[low] = num[high];
            while (low < high && num[low] <= temp) {
                low++;
            }
            num[high] = num[low];
        }
        num[low] = temp;
        return low;
    }

    private static void quickSort(int[] num, int low, int high) {
        if (low < high) {
            int middle = getMiddle(num, low, high);
//            for (int a : num) {
//                System.out.println(a);
//            }
            quickSort(num, low, middle - 1);
            quickSort(num, middle + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] num = {4,2,3,9,2,3,8,9};
        //int[] num = {1,3,3,4,7,8,9,12,22,65,12,8,9};
        quickSort(num, 0, num.length-1);
        for (int a : num) {
            System.out.println(a);
        }

    }

}
