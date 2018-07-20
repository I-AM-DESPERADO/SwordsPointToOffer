package com.tz.offor;

/**
 * create by tz on 2018-07-19
 */
/**
 * 题目描述
 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 * */
public class isNumeric {

    /**
     * 正则式方法
     * */
    public boolean isNumeric(char[] str) {

        String string = String.valueOf(str);
        return string.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
    }

    /**
     * 字符串转换函数
     * */
    public boolean isNumeric2(char[] str) {
        try {
            Double.parseDouble(new String(str));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * 剑指offer方法
     * */
    private int index = 0;
    public boolean isNumeric3(char[] str) {
        if (str.length < 1) return false;

        boolean flag = scanInteger(str);
        if (index < str.length && str[index] == '.') {
            index++;
            flag = scanUnsignedInteger(str) || flag;
        }
        if (index < str.length && (str[index] == 'E' || str[index] == 'e')) {
            index++;
            flag = flag && scanInteger(str);
        }
        return flag && index == str.length;
    }

    private boolean scanUnsignedInteger(char[] str) {
        int start = index;
        while (index < str.length && str[index] >= '0' && str[index] <= 9)
            index++;
        return start < index;

    }

    private boolean scanInteger(char[] str) {
        if (index < str.length && (str[index] == '+' || str[index] == '-'))
            index++;
        return scanUnsignedInteger(str);

    }


}
