package com.tz.renren;

/**
 * create by tz on 2018-09-03
 */
public class MyInteger {
    public Integer num;
    public Integer oneCount ;

    public MyInteger(Integer num) {
        this.num = num;
        this.oneCount = countOne(num);
    }
    private int countOne(Integer num) {
        int count = 0;
        Integer tmp = num;
        while (num > 0) {
            tmp &= (tmp -1);
            ++count;
        }
        return count;
    }
}
