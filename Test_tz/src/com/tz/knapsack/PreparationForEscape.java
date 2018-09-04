package com.tz.knapsack;

import java.util.Scanner;

/**
 * create by tz on 2018-09-02
 */
public class PreparationForEscape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int totalWeight = sc.nextInt();
        int k;
        int[] w = new int[num+1];
        int[] p = new int[num+1];
        int[] n = new int[num+1];
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String[] split = sc.nextLine().split(" ");
            w[i] = Integer.valueOf(split[1]);
            p[i] = Integer.valueOf(split[2]);
            n[i] = Integer.valueOf(split[0]);
        }
        int[] dp = new int[totalWeight+1];
        for (int i = 1; i <= num; i++) {
            for (int j= totalWeight; j >= 0; j--) {
                for (k = 1; k <= n[i]; k++) {
                    if (k * w[i] <= j) {
                        dp[j] = Math.max(dp[j], dp[j - k * w[i]]+k*p[i]);
                    }
                }
            }
        }
        for (int d : dp) {
            System.out.println(d + " ");
        }
    }

}
