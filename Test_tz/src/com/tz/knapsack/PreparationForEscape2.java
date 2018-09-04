package com.tz.knapsack;

import java.util.Scanner;

/**
 * create by tz on 2018-09-02
 */
public class PreparationForEscape2 {
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
        int[] tv = new int[num];
        int[] tw = new int[num];
        int[] dp = new int[totalWeight+1];
        optimize(tw,tv,w,p,n,totalWeight,num);
        for(int i=1;i<=totalWeight;i++)
            for(int j=totalWeight;j>=tw[i];j--)
                dp[j]=Math.max(dp[j],dp[j-tw[i]]+tv[i]);
        for (int d : dp) {
            System.out.println(d + " ");
        }
    }

    private static void optimize(int[] tw, int[] tv, int[] w, int[] p, int[] n, int totalWeight, int num) {
        for (int i = 1; i <= num; i++ ) {
            for (int j = 1; j <= n[i]; j<<=1) {
                tw[++totalWeight] = j * w[i];
                tv[totalWeight]=j*p[i];
                n[i]-=j;
            }
            if(n[i]!=0)
            {
                tw[++totalWeight]=n[i] * w[i];
                tv[totalWeight]=n[i]*p[i];
            }
        }

    }


}
