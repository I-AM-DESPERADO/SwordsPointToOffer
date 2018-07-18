package com.tz.offor;

/**
 * create by tz on 2018-07-18
 */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        if (array.length < 1) return 0;
        int count = 0;
       for (int i = 0; i <= array.length-1; i++) {
           if (array[i] == k) count++;
           else if (array[i] > k) break;
       }
        return count;
    }
}
