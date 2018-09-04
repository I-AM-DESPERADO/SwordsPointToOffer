package com.tz.renren;


import javax.naming.SizeLimitExceededException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * create by tz on 2018-08-30
 */
public class Main2 {
    private final static int SIZE = 6;
    private final static int[] money = {100, 50, 20, 10, 5, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] ss = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ss[i] = Integer.valueOf(s[i]);
        }
        for (int a : ss) {
            //System.out.println(a);
            System.out.print(lessChangeGiven(a) + "  ");
        }
    }

    private static int lessChangeGiven(int a) {
        if (a <= 0) {
            return 0;
        }
        int i;
        int best;
        int times = 0;

        if (a >= 100) {
            times = a/100;
            a -= (times*100);
        }
        if (a == 0) {
            System.out.print(times + " ");
        }
        for (i = 1; i < SIZE; ++i) {
            if (money[i] <= a && money[i - 1] > a) {
                break;
            }
        }
        int method1 = a - money[i];
        int method2 = money[i - 1] - a;
        best = method1 >= method2 ? method2 : method1;
        ++times;
        if (best != 0) {
            times += lessChangeGiven(best);
        }
        return times;
    }

}
