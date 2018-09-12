package com.tz.testEveryDay;

import org.junit.Test;

/**
 * create by tz on 2018-09-12
 */
public class BinarySearch {

    @Test
    public  void test() {
        int [] tar = {0, 12, 15, 25, 32, 45, 54, 56, 87, 95};
        int rs = getLocation(tar,12);
        System.out.println("位置"+ rs);
        System.out.println(rs==-1 ? "未找到": tar[rs-1]);
    }

    private int getLocation(int[] tar, int target) {
        int low = 0, high = tar.length - 1;
        int mid;
        while (low <= high) {
            mid = (low+high)>>1;
            if (target < tar[mid])
                high = mid - 1;
            else if (target >tar[mid])
                low = mid + 1;
            else
                return mid+1;
        }
        return -1;
    }


    public static int rank(int key, int[] arr, int low, int high) {
        if (low > high)
            return -1;
        int mid = low + (high - low) >>1;
        if (key < arr[mid]) {
            return rank(key, arr, low, mid - 1);
        }else if (key > arr[mid]) {
            return rank(key, arr, mid + 1, high);
        } else return mid;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,3,5,6,7,8,8,9};
        int rs = rank(3,arr,0,8);
        System.out.println("resultPosition="+rank(3,arr,0,8));
    }


}
