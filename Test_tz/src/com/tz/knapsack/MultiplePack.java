package com.tz.knapsack;

/**
 * create by tz on 2018-09-02
 */
public class MultiplePack {

    public static void main(String[] args) {
        int n = 5;
        int [] weight = {5,4,7,2,6};
        int [] value = {12,3,10,3,6};
        int target = 15;
        int [] account = {2,4,6,8,1};//每种物品的数量
        int[] arr = new int[target + 1];

        for (int i = 0; i < n; i++) { // i 表示背包中可以放前（i + 1） 种物品
            // 完全背包问题
            if (weight[i] * account[i] >= target) {
                for (int j = weight[i]; j <= target; j++) {
                    arr[j] = Math.max(arr[j], arr[j-weight[i]] + value[i]);
                }
            }

            //01背包问题，并使用二进制方法进行优化
            int tmpCount = 1;
            while (tmpCount < account[i]) {
                for (int j = target; j >= tmpCount * weight[i]; j--) {  // j 表示当前背包的容量
                    arr[j] = Math.max(arr[j],arr[j - tmpCount * weight[i]] + tmpCount * value[i]);
                }

                account[i] -= tmpCount;
                tmpCount = tmpCount << 1;
            }

            for (int j = target; j >= weight[i]; j--) {  // j 表示当前背包的容量
                arr[j] = Math.max(arr[j],arr[j - weight[i]] + value[i]);
            }
        }
        for (int i = 0; i <= target; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
