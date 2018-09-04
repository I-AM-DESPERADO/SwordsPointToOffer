package com.tz.zhihu;

import java.util.Scanner;

/**
 * create by tz on 2018-09-02
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt();
        int len2 = sc.nextInt();
        int[] nums1 = new int[len1];
        int[] nums2 = new int[len2];
        for (int i = 0; i < len1; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < len2; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] merge = merge(nums1, nums2);
        for (int mer : merge) {
            System.out.print(mer + " ");
        }
    }

    public static int[] merge(int[] a, int[] b) {
        int len = a.length + b.length;
        int[] temp = new int[len];
        int i = 0, j = 0, h = 0;
        while (i < a.length || j < b.length) {
            if (i == a.length && j < b.length) {
                temp[h++] = b[j++];
            } else if (i < a.length && j == b.length) {
                temp[h++] = a[i++];
            } else if (a[i] <= b[j]) {
                temp[h++] = a[i++];
            } else if (a[i] > b[j]) {
                temp[h++] = b[j++];
            }
        }
        return temp;
    }


}
