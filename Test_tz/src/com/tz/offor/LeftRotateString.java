package com.tz.offor;

/**
 * create by tz on 2018-07-18
 */

/**
 *题目描述
 汇编语言中有一种移位指令叫做循环左移（ROL），
 现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，
 即“XYZdefabc”。是不是很简单？OK，搞定它！
 * */
public class LeftRotateString {
    public static String LeftRotateString(String str, int n) {
        /*while (n > str.length()) {
            n = n - str.length();
        }*/
        if (str == null || "".equals(str)) return "";
        n %= str.length();
        if (n == 0) return str;
        StringBuffer sb1 = new StringBuffer(str);
        StringBuffer sb2 = new StringBuffer(str);
        StringBuffer sb = new StringBuffer();
        sb= sb.append(sb2.delete(0,n)).append(sb1.delete(n,str.length()));
        System.out.println(sb1.toString());
        System.out.println(sb2.toString());
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        String string = "abcdefg";
        LeftRotateString(string, 10);
    }

}
