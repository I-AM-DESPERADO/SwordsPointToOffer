package com.tz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        String s = sc.nextLine();
        String[] split = s.split(" ");
        for (String ss : split) {
            list.add(Integer.valueOf(ss));
        }
        int len = list.size();
        //Integer[] os = (Integer[]) list.toArray();
        int i = 0,j = len-1;
        int max = 0;
        for (; i<j; i++) {
            for (; j > i; j--) {
                if (list.get(j)>list.get(i)){
                    max = Math.max(max,(list.get(j)-list.get(i)));
                }
            }
            j=len-1;
        }
        System.out.println(max);

    }
}
