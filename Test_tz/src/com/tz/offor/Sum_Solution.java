package com.tz.offor;

/**
 * create by tz on 2018-07-18
 */
public class Sum_Solution {

    //等差数列求和
    public int Sum_Solution(int n) {
        int result = (int) (Math.pow(n,2)+n)>>1;
        return result;
    }

    //异常退出递归累加
    public int Sum_Solution2(int n) {
        int sum = n;
        try {
            sum += Sum_Solution2(n-1)% n;
            return sum;
        }catch (Exception e) {
            return 0;
        }
    }


    /**
     * 解题思路：
     * 1.需利用逻辑与的短路特性实现递归终止。
     * 2.当n==0时，(n>0)&&((sum+=Sum_Solution(n-1))>0)只执行前面的判断，为false，然后直接返回0；
     * 3.当n>0时，执行sum+=Sum_Solution(n-1)，实现递归计算Sum_Solution(n)。
     * */
    public int Sum_Solution3(int n) {
        int sum = n;
        boolean bl = n>0 && (sum = sum+Sum_Solution3(n-1))>0;
        return sum;
    }

}
