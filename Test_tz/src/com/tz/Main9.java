package com.tz;

import java.util.Scanner;

/**
 * create by tz on 2018-09-08
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int mid = 0;
        long time1 = System.currentTimeMillis();
        for (int k = 1; k < 2 * num; k=k+2){
            mid++;
            for (int i = 1;i<= k;i = i+1) {
                if (i < mid ) {
                    System.out.print(i+" ");
                } else{
                    System.out.print(mid-(i-mid));
                }
            }
            System.out.println();
        }
        System.out.println(System.currentTimeMillis()-time1);
    }
}
