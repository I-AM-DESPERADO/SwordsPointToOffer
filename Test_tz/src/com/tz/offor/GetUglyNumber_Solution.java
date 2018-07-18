package com.tz.offor;

import java.util.ArrayList;

/**
 * create by tz on 2018-07-16
 */

/**
 * 题目描述
 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 例如6、8都是丑数，但14不是，因为它包含质因子7。
 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * */
public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index == 0) return 0;
        ArrayList<Integer> listRs = new ArrayList<Integer>();
        listRs.add(1);
        int i2 = 0, i3 = 0, i5 = 0;
        while (listRs.size() < index) {
            int m2 = listRs.get(i2)*2;
            int m3 = listRs.get(i3)*3;
            int m5 = listRs.get(i5)*5;
            int min = Math.min(m2,Math.min(m3,m5));
            listRs.add(min);
            if (min == m2) i2++;
            if (min == m3) i3++;
            if (min == m5) i5++;
        }
        return listRs.get(listRs.size()-1);
    }
}
