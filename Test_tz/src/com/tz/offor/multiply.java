package com.tz.offor;

/**
 * create by tz on 2018-07-19
 */
public class multiply {


    /**
     *
     * 剑指的思路：
     * B[i]的值可以看作下图的矩阵中每行的乘积。
     * 下三角用连乘可以很容求得，上三角，从下向上也是连乘。
     * 因此我们的思路就很清晰了，先算下三角中的连乘，即我们先算出B[i]中的一部分，然后倒过来按上三角中的分布规律，把另一部分也乘进去。
     * */
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        if (len < 1) return B;
        B[0] = 1;
        //下三角连乘
        for (int i = 1; i < len; i++) {
            B[i] = B[i-1] * A[i-1];
        }
        int temp = 1;
        //上三角连乘
        for (int j = len-2; j >= 0; j--) {
            temp *= A[j+1];
            B[j] *= temp;
        }
        return B;
    }

    /**
     * 借助中间数组实现，两部分分别存到数组中，再
     * */
    public int[] multiply1(int[] A) {
        int len = A.length;
        int[] forword = new int[len];
        int[] backword = new int[len];
        int[] B = new int[len];
        forword[0] = 1;
        backword[0] = 1;
        for (int i = 1; i < len; i++) {
            forword[i] = A[i - 1] * forword[i - 1];
            backword[i] = A[len - i] * backword[i - 1];
        }
        for (int j = 0; j < len; j++) {
            B[j] = forword[j] * backword[len - j -1];
        }
        return B;

    }


}
