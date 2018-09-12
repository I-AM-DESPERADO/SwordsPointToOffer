package com.tz.kdxf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        if (num <= 1){
            System.out.println(0);
            return;
        }

        String[] split = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for(String temStr : split) {
            list.add(Integer.valueOf(temStr));
        }
        boolean flag = true;
        int count = 0;
        for (int i = list.size()-1; i > 0; i--) {
            if(list.get(i) < list.get(i-1)) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(0);
            return;
        }
        while (!flag) {
            flag = true;
            for (int i = list.size()-1; i > 0; i--) {
                //System.out.println("i = " + i);
                if (list.get(i) < list.get(i-1)) {
                    list.remove(i);
                }
            }
            for (int i = list.size()-1; i > 0; i--) {
                if(list.get(i) < list.get(i-1)) {
                    flag = false;
                }
            }
            count++;
        }
        System.out.println(count);

    }
}
