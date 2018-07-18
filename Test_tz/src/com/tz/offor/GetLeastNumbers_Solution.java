package com.tz.offor;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * create by tz on 2018-07-16
 */
/**
 * 题目描述
 输入n个整数，找出其中最小的K个数。
 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。*/


public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList list = new ArrayList();
        if(input.length < k) return list;
        Arrays.sort(input);
        for(int i=0; i<input.length && i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }
}
