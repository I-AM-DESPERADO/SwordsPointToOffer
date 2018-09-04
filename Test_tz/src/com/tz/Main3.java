package com.tz;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ss = s.toCharArray();
        int len = ss.length;
        int min1= 0, min2 = 0,min3=0,min4 = 0, min = 0;
        char temp;
        int j = 0;
        for (int i = 0; i < len-1; i++) {
            if (ss[i] == 'D') {
                min1 += (len-1-i-j);
                j++;
            }
        }
        j = 0;
        for (int i = 0; i < len-1; i++) {
            if (ss[i] == 'C') {
                min2 += (len-1-i-j);
                j++;
            }
        }
        j = 0;
        for (int i = len-1; i >= 0; i--) {
            if (ss[i] == 'C') {
                min3 += (i-j);
                j++;
            }
        }
        j = 0;
        for (int i = len-1; i >= 0; i--) {
            if (ss[i] == 'D') {
                min4 += (i-j);
                j++;
            }
        }

        min = Math.min(min1,min2);
        min = Math.min(min,min3);
        min = Math.min(min,min4);

        System.out.println(min);
    }
}
