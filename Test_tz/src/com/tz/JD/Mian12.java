package com.tz.JD;

import java.util.Arrays;
import java.util.Scanner;


public class Mian12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        String[] split = sc.nextLine().split(" ");
        int[] nums = new int[num];
        for(int i = 0; i < num; i++) {
            nums[i] = Integer.valueOf(split[i]);
        }
        float mid;
        float rs;
        Arrays.sort(nums);
        if (num%2==0) {
            int aIndex = num/2 - 1;
            int bIndex = num/2;
            mid = (Float.valueOf(nums[aIndex])+Float.valueOf(nums[bIndex]))/2;
            if (mid % 1 == 0) {
                System.out.println((int)mid);
                return;
            }
            rs = mid;
            System.out.println(rs);
        } else {
            int index = num/2;
            int rs1 = nums[index];
            System.out.println(rs1);
        }

    }
}
