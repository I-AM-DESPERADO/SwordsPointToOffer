package com.tz;

import java.util.Scanner;

/**
 * create by tz on 2018-09-06
 */
public class meituan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mas = new int[5][5];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            mas[x-1][y-1] = 1;
            mas[y-1][x-1] = 1;
            mas[i][i] = 1;
        }

    }
}
