package com.tz.offor;

import java.util.ArrayList;

/**
 * create by tz on 2018-07-18
 */

/**
 *题目描述
 *输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * */
public class FindNumbersWithSum {
    /**
     * 夹逼是最简单的方式，因为是有序数字，第一组找出的一对数肯定是最小的
     */
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array==null || array.length < 2) return list;
        if (array.length == 2 && array[0]+array[1] != sum) return list;
        int low = 0, high = array.length-1;
        while (low < high) {
            if (array[low] + array[high] == sum) {
                list.add(array[low]);
                list.add(array[high]);
                return list;
            }else if (array[low] + array[high] > sum) high--;
            else low++;
        }
        return list;
    }

}
