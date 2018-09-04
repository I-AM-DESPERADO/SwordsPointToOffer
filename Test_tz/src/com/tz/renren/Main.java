package com.tz.renren;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * create by tz on 2018-08-30
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inStr = sc.nextLine();
        char[] chars = inStr.toCharArray();
        List<String> list = new ArrayList<>();
        for (char c:chars) {
            if (c=='+') {
                list.add("/\\");
            }else if (c == '-') {
                list.add("__");
            }
        }
        for (String a :list) {
            System.out.print(a);
        }
    }
}
