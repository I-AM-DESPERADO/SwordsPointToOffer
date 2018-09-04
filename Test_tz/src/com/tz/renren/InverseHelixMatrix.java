package com.tz.renren;

import java.util.Scanner;

/**
 * create by tz on 2018-09-03
 */
public class InverseHelixMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        printMatrix(x, y);
    }

    private static void printMatrix(int x, int y) {
        int[] listMa = new int[x*y];
        int[][] mat = new int[x][y];
        int i=0, j=0;
        for (int a : listMa) {
            if (i==0 && j==0) {
                mat[i][j] = a;
                j++;
            }
            if (i < y-1 && j < x-1 && mat[i][j + 1] == 0) {
                //if (i != 0 && mat[i-1][j] < a)
                mat[i][j] = a;
                j++;
            }else if (i < y-1 && j < x-1 && mat[i+1][j] == 0 && mat[i][j+1] < a) {
                mat[i][j] = a;
                i++;
            }else if (i < y-1 && j <x-1 && mat[i][j-1] == 0 ) {
                mat[i][j] = a;
                j--;
            }else if (i < y-1 && j <x-1 && mat[i][j-1] == 0) {
                mat[i][j] = a;
                i--;
            } else if (j == y-1 && i < x-1) {
                mat[i][j] = a;
                i++;
            }else if (j == y-1 && i == x-1) {
                mat[i][j] = a;
                j--;
            }else if (i == x-1 && j < y - 1) {
                mat[i][j] = a;
                i--;
            } //else if (i == )
        }
    }
}
