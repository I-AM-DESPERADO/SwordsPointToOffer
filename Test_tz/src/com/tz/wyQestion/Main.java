package com.tz.wyQestion;

import java.util.Scanner;

/**
 * create by tz on 2018-08-28
 *
 * 题目描述
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
 * 要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 * 输入描述:
 * 每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生的个数，接下来的一行，
 * 包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            int selNum = sc.nextInt();
            int dd = sc.nextInt();


            long[][] f = new long[n + 1][selNum+1];
            long[][] g = new long[n + 1][selNum+1];
            for (int i = 1; i<=n;i++) {
                f[i][1] = arr[i];
                g[i][1] = arr[i];
            }

            for (int k = 2; k<=selNum; k++) {
                for (int one = k; one <= n; one++) {
                    long tempMax = Long.MIN_VALUE;
                    long tempMin = Long.MAX_VALUE;
                    for (int left = Math.max(k-1,one-dd); left <= one-1; left++) {
                        if (tempMax<Math.max(f[left][k-1]*arr[one],g[left][k-1])) {
                            tempMax=Math.max(f[left][k-1]*arr[one],g[left][k-1]*arr[one]);
                        }
                        if(tempMin>Math.min(f[left][k-1]*arr[one],g[left][k-1]*arr[one])){
                            tempMin=Math.min(f[left][k-1]*arr[one],g[left][k-1]*arr[one]);
                        }
                    }
                    f[one][k] = tempMax;
                    g[one][k] = tempMin;
                }
            }
            //n选k最大的需要从最后一个最大的位置选
            long result = Long.MIN_VALUE;
            for(int one = selNum;one<=n;one++){
                if(result<f[one][selNum]){
                    result = f[one][selNum];
                }
            }
            System.out.println(result);
        }

    }
}
