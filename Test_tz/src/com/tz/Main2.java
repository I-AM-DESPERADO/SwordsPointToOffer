package com.tz;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (sc.hasNext()) {
            String a = sc.nextLine();
            char[] cc = a.toCharArray();
            int temp = 0;

            for (int i = cc.length-1; i >= 0; i--) {
                temp += (cc[i]-'0');
                if (temp%3 == 0) {
                    num++;
                    temp = 0;
                }
            }
            System.out.println(num);
        }
    }
}
