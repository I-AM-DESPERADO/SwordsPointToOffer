package com.tz;

/**
 * create by tz on 2018-07-19
 */
public class testNiuke1 {

    public static String isJielong(String a) {
        String[] split = a.split(" ");
        char[] charsA = split[0].toCharArray();
        char[] charsB = split[1].toCharArray();
        char[] charsC = split[2].toCharArray();
        if (charsA[charsA.length-1] == charsB[0] && charsB[charsB.length-1] == charsC[0])
            return "YES";
        else return "No";


    }

    public static void main(String[] args) {
        String a = "abc "+"cdf "+"feg";
        String jielong = isJielong(a);
        System.out.println(jielong);
    }
}
