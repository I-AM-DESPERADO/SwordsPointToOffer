package com.tz.offor;

/**
 * create by tz on 2018-07-24
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目描述
 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * */

public class maxInWindows {

    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if (num == null || size < 0) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if (size == 0) {
            return list;
        }
        ArrayList<Integer> temp = null;
        int len = num.length;
        if (len < size) {
            return list;
        }
        else {
            for (int i = 0; i < len - size + 1; i++) {
                temp = new ArrayList<>();
                for (int j = i; j < size + i; j++) {
                    temp.add(num[j]);
                }
                Collections.sort(temp);
                list.add(temp.get(temp.size()-1));
            }
        }
            return list;
    }


    /**
     * 双端队列
     * */
    public static ArrayList<Integer> maxInWindows2(int[] num, int size) {
        LinkedList<Integer> temp = new LinkedList<>();
        if (num == null || size < 0) return null;
        if (size == 1 || size == 0) return new ArrayList<Integer>();
        int len = num.length;
        if (len < size) return new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < len - size + 1; i++) {
            for (int j = i; j < size + i; j++) {
                if (!temp.isEmpty()) {
                    if (temp.getLast() < num[j])
                        temp.offerLast(num[j]);
                }else temp.offerLast(num[j]);
            }
            System.out.print(temp);
            list.add(temp.getLast());
            temp.removeFirst();
        }
        return list;
    }

    public static void main(String[] args) {
        int[] num = {2,3,4,2,6,2,5,1};
        int size = 3;
        ArrayList<Integer> list = maxInWindows2(num, size);

    }


}
