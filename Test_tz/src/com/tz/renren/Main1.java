package com.tz.renren;

import java.util.Scanner;

/**
 * create by tz on 2018-08-30
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int b = sc.nextInt();
            int x ,y;
            for (x = 2; (b-1)%x > 0; x++);
            for (y = 2; (b+1)%y > 0; y++);
            System.out.println("x = "+x + ",y = " + y);
        }


    }
}
