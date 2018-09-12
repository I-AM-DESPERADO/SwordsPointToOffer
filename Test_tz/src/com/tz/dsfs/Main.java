package com.tz.dsfs;

import java.util.Scanner;

/**
 * create by tz on 2018-09-09
 */
public class Main {

    private static int flag, maxLen;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        if (len < 2) {
            System.out.println(str);
            return;
        }
        for (int i = 0; i < len-1; i++) {
            handleString(str, i, i);  //若是奇数
            handleString(str, i, i+1); //若是偶数
        }
        String rs = str.substring(flag, flag + maxLen);
        System.out.println(rs);
    }


    private static void handleString(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            flag = j + 1;
            maxLen = k - j - 1;
        }
    }


}
