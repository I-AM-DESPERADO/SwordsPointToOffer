package com.tz.JD;

import java.util.*;

/**
 * create by tz on 2018-09-07
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Set<Integer> set = new TreeSet<Integer>();
            int numA = sc.nextInt();
            int numB = sc.nextInt();
            int[] as = new int[numA];
            int[] bs = new int[numB];
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i<numA; i++) {
                as[i] = sc.nextInt();
                set.add(as[i]);
            }
            for (int i = 0; i<numB; i++) {
                bs[i] = sc.nextInt();
                set.add(bs[i]);
            }
            list.addAll(set);
            Object[] rs = list.toArray();
            Arrays.sort(rs);
            for (Object r : rs) {
                System.out.println(r + " ");
            }
        }
    }
}
