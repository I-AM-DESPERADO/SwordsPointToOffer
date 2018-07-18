package com.tz.offor;

/**
 * create by tz on 2018-07-18
 */

/***
 *题目描述
 *一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length<=1) return;

        int a = 0,b = 1;
        for (int i = 0; i < array.length; i++) {
            a ^= array[i];
        }
        while ((a&b) == 0) b <<= 1;
        for (int i = 0; i < array.length; i++) {
            if ((b & array[i]) == 0) num2[0]^=array[i];
            else num1[0] ^= array [i];
        }


    }
}
