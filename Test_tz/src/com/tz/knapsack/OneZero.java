package com.tz.knapsack;

/**
 * create by tz on 2018-09-02
 */
public class OneZero {
    public static void main(String[] args) {
        int m = 10;//背包容量
        int n = 3; //物品数量
        int w[] = {3,4,5}; //各个物品重量
        int p[] = {4,5,6}; //各个物品价值
        int c[][] = BackPack_Solution(m, n, w, p);
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=m; j++) {
                System.out.print(c[i][j]+"\t");
                if(j==m){
                    System.out.println();
                }
            }
        }
    }


    /**
     * @param m 表示背包的最大容量
     * @param n 表示商品个数
     * @param w 表示商品重量数组
     * @param p 表示商品价值数组
     */
    private static int[][] BackPack_Solution(int m, int n, int[] w, int[] p) {
        int[][] c = new int[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            c[i][0] = 0;
        }
        for (int i = 0; i < m + 1; i++) {
            c[0][i] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (w[i-1] < j) {
                    if(c[i-1][j] < (c[i-1][j - w[i-1]] + p[i-1])){
                        c[i][j] = c[i-1][j - w[i-1]] + p[i-1];
                    }else
                        c[i][j] = c[i - 1][j];
                }else
                    c[i][j] = c[i - 1][j];
            }
        }
        return c;

    }



}
