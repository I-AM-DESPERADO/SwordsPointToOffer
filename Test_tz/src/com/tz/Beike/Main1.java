package com.tz.Beike;

import java.util.Scanner;

/**
 * create by tz on 2018-09-03
 */



public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int count = 0;
        if (one<two){
            while (two/one >= 2){
                if (two%2 != 1){
                    two = two / 2;
                    count += 1;
                }else{
                    two = (two + 1) / 2;
                    count += 2;
                }
            }
            if (two%2 == 1){
                count += one - ( two + 1 ) / 2 + 2;
            }
            else{
                count += one - two / 2 + 1;
            }
            System.out.println(count);
        }
        else{
            count = one - two;
            System.out.println(count);
        }



    }
}
