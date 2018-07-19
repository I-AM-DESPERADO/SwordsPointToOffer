package com.tz.offor;

/**
 * create by tz on 2018-07-18
 */
public class StrToInt {

    public int StrToInt(String str) {
        if ("".equals(str) || str.length() < 1) return 0;
        char[] chars = str.toCharArray();
        int fuhao = 0;
        if (chars[0] == '-') fuhao = 1;
        int sum = 0;
        for (int i = fuhao; i < chars.length; i++) {
            if (chars[i] == '+') continue;
            if (chars[i] < 48 || chars[i] > 57) return 0;
            sum = sum * 10 + chars[i] - 48;
        }
        return fuhao == 0 ? sum:sum * -1;
       // Integer.parseInt();
       // Integer.valueOf()
    }
    public static void main(String[] args) {
        /*int digit = Character.digit(51, 6);//正常
        int digit2 = Character.digit(50,2);//越界
        int digit3 = Character.digit(47,2);//非数字ASCII码
        System.out.println("digit = " + digit);
        System.out.println("digit2 = " + digit2);
        System.out.println("digit3 = " + digit3);*/
        int multmin = -Integer.MAX_VALUE/10;
        System.out.println(multmin);

    }

}
