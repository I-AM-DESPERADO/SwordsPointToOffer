package com.tz.zhihu;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

/**
 * create by tz on 2018-09-02
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i<len; i++) {
            nums[i] = sc.nextInt();
        }
        int rs = maxChildArray(nums,len);
        System.out.println(rs);
    }



    public static int maxChildArray(int[] nums, int len) {
        if (len == 0) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }

        int rs = dp[0];
        for (int i = 1; i < len; i++) {
            rs = Math.max(rs,dp[i]);
        }
        return rs;
    }

}
