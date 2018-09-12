package com.tz.kdxf;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * create by tz on 2018-09-07
 */


public class Mian2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,n,x;
        int num1 = sc.nextInt();
        while (sc.hasNext()) {
            n = sc.nextInt();
            x = sc.nextInt();
            int[] a = new int[n];
            for(int i = 1;i <= n;i++){
                a[i] = a[i]-x;
                sum+=a[i];
            }
            if (sum >= 0) System.out.println(0);
            else
            {
                int gap = 100 - x,cnt = 0;
                int[] temp = new int[n];
                for (int i=0;i< n; i++ ) {
                    temp[i] = a[i+1];
                }
                Arrays.sort(temp);
                for(int i = 1;i <= n;i++)
                {
                    sum -= a[i];
                    sum += gap;
                    cnt++;
                    if (sum >= 0)
                    {
                        System.out.println(cnt);
                        break;
                    }
                }
            }

        }
    }
}
