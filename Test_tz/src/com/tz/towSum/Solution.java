package com.tz.towSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * create by tz on 2018-07-04
 */
public class Solution {
    public ArrayList<int[]> towSum(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        ArrayList<int[]> listRs = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(target-nums[j]) && map.get(target-nums[j])!=j) {
                int[] t = new int[2];
                t[0] = nums[j];
                t[1] = target - nums[j];
                listRs.add(t);
            }
        }

        return listRs;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<int[]> listRs = new Solution().towSum(nums, 11);
        for (int[] a : listRs) {

            System.out.println(a[0] +" + " +a[1]);
        }
    }

}
