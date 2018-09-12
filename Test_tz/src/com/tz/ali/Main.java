package com.tz.ali;

import java.util.HashMap;
import java.util.Scanner;

/**
 * create by tz on 2018-09-07
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(",");
        int x = Integer.valueOf(a[0]);
        int y = Integer.valueOf(a[1]);
        String[] p = sc.nextLine().split(",");
        int[] p1 = new int[2];
        p1[0] = Integer.valueOf(p[0]);
        p1[1] = Integer.valueOf(p[1]);
        int[] p2 = new int[2];
        p2[0] = Integer.valueOf(p[2]);
        p2[1] = Integer.valueOf(p[3]);
        int[] p3 = new int[2];
        p3[0] = Integer.valueOf(p[4]);
        p3[1] = Integer.valueOf(p[5]);
        int[] p4 = new int[2];
        p4[0] = Integer.valueOf(p[6]);
        p4[0] = Integer.valueOf(p[7]);

        boolean flag = false;
        int rsx = 0;
        int rsy = 0;
        int rs = 0;
        if (x >= p1[0] && x <= p3[0] && y>=p1[1] && y<=p3[1]) {
            flag = true;
        } else {
            if (x<p1[0]) {
                rsx = p1[0] - x;
                if (y<p1[1]) {
                    rsy =  p1[1] - y;
                }else if (y>p3[1]) {
                    rsy =  y - p3[1];
                }
            }
            else if (x>p4[0]) {
                rsx = x - p4[0];
                if (y<p1[1]) {
                    rsy =  p1[1] - y;
                }else if (y>p3[1]) {
                    rsy =  y - p3[1];
                }
            }
            rs = (int)Math.sqrt(rsx*rsx+rsy*rsy);
        }

        System.out.println(flag+ "," +rs);

        HashMap<String, Integer> mp = new HashMap();
    }


}
