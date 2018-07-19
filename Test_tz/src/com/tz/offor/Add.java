package com.tz.offor;

/**
 * create by tz on 2018-07-18
 */

/**
 * 题目描述
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 * */

public class Add {

    /**
     * 思路：位运算
     * 1.两个数异或：相当于每一位相加，而不考虑进位；
     * 2.两个数相与，并左移一位：相当于求得进位；
     * 3.将上述两步的结果相加
     * */
    public static int Add(int num1, int num2) {

        while (num2 != 0) {
            int sum = num1^num2;
            int carry = (num1&num2)<<1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }

    public static void main(String[] args) {
        int add = Add(3, 5);
    }
}
