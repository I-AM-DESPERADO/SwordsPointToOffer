package com.tz.offor;

import java.util.ArrayList;

/**
 * create by tz on 2018-07-18
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> rslist = new ArrayList<>();
       int low = 1, high = 2;
       while (low<high) {
           //等差数列求和公式
           int cur = (low+high)*(high-low+1)/2;
           if (cur==sum) {
               ArrayList<Integer> list = new ArrayList<>();
               for (int i = low; i <= high; i++) {
                   list.add(i);
               }
               rslist.add(list);
               low++;
           }else if (cur > sum) low++;
           else high++;
       }
       return rslist;
    }
}
