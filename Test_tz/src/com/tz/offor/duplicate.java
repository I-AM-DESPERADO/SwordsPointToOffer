package com.tz.offor;

import java.util.HashSet;

/**
 * create by tz on 2018-07-19
 */
public class duplicate {

    //  使用hash方法
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if (length < 2) {
            return false;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < length; i++) {
            if (hashSet.contains(Integer.valueOf(numbers[i]))) {
                duplication[0] = numbers[i];
                return true;
            }
            hashSet.add(Integer.valueOf(numbers[i]));
        }
        return false;
    }

    //使用字符串比较法，有点绕弯
    public boolean duplicate2(int numbers[],int length,int [] duplication) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(numbers[i] + "");
        }
        for (int j = 0; j < length; j++) {
            if (sb.indexOf(numbers[j]+"") != sb.lastIndexOf(numbers[j]+"")){
                duplication[0] = numbers[j];
                return true;
            }
        }
        return false;
    }
}
