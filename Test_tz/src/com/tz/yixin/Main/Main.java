package com.tz.yixin.Main;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Pattern pattern = Pattern.compile("[0-9]*");
        boolean bl1 = pattern.matcher(str1).matches();
        boolean bl2 = pattern.matcher(str2).matches();
        if (!bl1||!bl2) {
            System.out.println("字符串输入不为纯数字！");
            return;
        }
        if ("0".equals(str1) || "0".equals(str2)) {
            System.out.println(0);
            return;
        }
        int len1 = str1.length();
        int len2 = str2.length();
        String rs = "0";
        for (int i = len1-1; i >= 0; i--) {
            int tem = 0;
            int mm = str1.charAt(i) - 48;
            if (mm == 0) {
                continue;
            }
            StringBuilder sb = new StringBuilder();
            int count = str1.length() - 1 - i;
            for (int k = 0; k < count; k++)
                sb.append(0);
            
            for(int j = len2 - 1; j >= 0; j--){
                int one = str2.charAt(j) - 48;
                int two = one*mm + tem;
                sb.append(two % 10);
                tem = two / 10;
            }
            if(tem != 0) sb.append(tem);

            tem = 0;
            String addStr = sb.toString();
            StringBuilder sb2 = new StringBuilder();

            int s1 = 0;
            int s2 = 0;
            while(s1 < addStr.length() || s2 < rs.length()){
                int sum = tem;
                if(s1 < addStr.length()){
                    sum += addStr.charAt(s1++) - 48;
                } 
                if(s2 < rs.length()){
                    sum += rs.charAt(s2++) - 48;
                } 
                sb2.append(sum % 10);
                tem = sum / 10;
            }
            if(tem != 0) {
                sb2.append(tem);
            }
            rs = sb2.toString();
        }
        StringBuffer sb3=new StringBuffer(rs);
        sb3 = sb3.reverse();
        System.out.println(sb3.toString());
    }
}

