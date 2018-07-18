package com.tz.offor;

import java.util.*;

/**
 * create by tz on 2018-07-16
 */
/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * */

public class PrintMinNumber {
    public String PrintMinNumber1(int [] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        for (Integer a : numbers) {
            list.add(a);
        }
        Collections.sort(list, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        String s1 = o1+""+o2;
                        String s2 = o2+""+o1;
                        return s1.compareTo(s2);
                    }
                }
        );
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer b : list) {
            stringBuilder.append(b);
        }
        return stringBuilder.toString();
    }


    public String PrintMinNumber2(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        int len = numbers.length;
        String[] strs = new String[len];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= len; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                StringBuilder sb = new StringBuilder();
                String c1 = sb.append(o1).append(o2).toString();
                sb.delete(0,sb.length());
                String c2 = sb.append(o2).append(o1).toString();
                return c1.compareTo(c2);
            }
        });
        for (int i = 0; i< len; i++) {
            stringBuilder.append(strs[i]);
        }
        return stringBuilder.toString();
    }


}
