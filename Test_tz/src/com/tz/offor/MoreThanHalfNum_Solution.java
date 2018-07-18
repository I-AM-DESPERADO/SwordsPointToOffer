package com.tz.offor;

import java.util.Arrays;

/**
 * create by tz on 2018-07-16
 */

/**
 * 题目描述
 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 如果不存在则输出0。*/
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int length = array.length;
        if(array.length < 1){
            return 0;
        }
        if(array.length == 1) {
            return array[0];
        }
        int count = 0;
        Arrays.sort(array);
        int ta = array[length/2];
        for(int i = 1;i<length; i++) {
            if(array[i] == ta) {
                count++;
            }
        }
        if(count<=length/2) {
            return 0;
        } else return ta;

    }
}
