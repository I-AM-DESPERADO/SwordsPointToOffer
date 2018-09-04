package com.tz.renren;

/**
 * create by tz on 2018-09-03
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 对一个unsigned int32型数组a进行排序，记ni为a[i]的二进制表示中"1"的数量，指定排序策略如下：
 a)            如果ni < nj，则a[i]排在a[j]前面
 b)           如果ni == nj，按值从小到大排序
 * */
public class Main3 {
    private static class myComparator implements Comparator<MyInteger> {

        @Override
        public int compare(MyInteger o1, MyInteger o2) {
            if (o1.oneCount > o2.oneCount) {
                return -1;
            }else if (o1.oneCount < o2.oneCount) {
                return 1;
            }else {
                if (o1.num > o2.num) {
                    return -1;
                } else if (o1.num < o2.num) {
                    return 1;
                } else return 0;
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split(" ");
        ArrayList<MyInteger> list = new ArrayList<>();
        for (String s : ss) {
            System.out.println("ok1");
            list.add(new MyInteger(Integer.valueOf(s)));
            System.out.println("ok3");
            System.out.println(Integer.valueOf(s));
        }
        for (MyInteger m: list){
            System.out.println("ok");
            System.out.print(m.num + " ");
        }

        list.sort(new myComparator());
        for (MyInteger m: list){
            System.out.print(m.num + " ");
        }

    }








}
