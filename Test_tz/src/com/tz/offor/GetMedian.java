package com.tz.offor;

import java.util.LinkedList;

/**
 * create by tz on 2018-07-24
 */

/**
 * 题目描述
 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 * */

public class GetMedian {

    LinkedList<Integer> list = new LinkedList<>();

    public void Insert(Integer num) {
        if (list.size() == 0 || num < list.getFirst()) {
            list.addFirst(num);
        }
        else {
            boolean flag = false;
            for (Integer e : list) {
                if (num < e) {
                    int index = list.indexOf(e);
                    list.add(index, num);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                list.add(num);
            }
        }
    }

    public Double GetMedian() {
        if (list.size() == 0) {
            return null;
        }
        if (list.size() % 2 == 0) {
            int i = list.size()/2;
            Double a = Double.valueOf(list.get(i - 1) + list.get(i));
            return a / 2;
        }
        else {
            list.get(0);
            Double b = Double.valueOf(list.get((list.size() + 1) / 2 - 1));
            return  Double.valueOf(list.get((list.size() + 1) / 2 - 1));
        }
    }

}
