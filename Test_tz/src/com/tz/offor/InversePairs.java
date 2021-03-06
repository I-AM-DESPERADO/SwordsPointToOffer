package com.tz.offor;

/**
 * create by tz on 2018-07-17
 */

/**
 * 题目描述
 在数组中的两个数字，如果前面一个数字大于后面的数字，
 则这两个数字组成一个逆序对。
 输入一个数组,求出这个数组中的逆序对的总数P。
 并将P对1000000007取模的结果输出。 即输出P%1000000007
 * */
public class InversePairs {
    public int InversePairs(int [] array) {
        if (array == null || array.length == 0) return 0;
        int [] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        int count = InversePairsCore(array ,copy, 0, array.length-1);
        return count;
    }

    private int InversePairsCore(int[] array, int[] copy, int low, int high) {
        if (low == high) return 0;
        int mid = (low+high)>>1;//相当于(low+high)/2
        int leftCount = InversePairsCore(array, copy, low, mid)%1000000007;
        int rightCount = InversePairsCore(array, copy, mid+1, high)%1000000007;
        int count = 0;
        int i = mid;
        int j = high;
        int locCopy = high;
        while (i>=low && j>mid) {
            if (array[i] >array[j]) {
                count += j-mid;
                copy[locCopy--] = array[i--];
                if (count>=1000000007)
                    count%=1000000007;
            }else
                copy[locCopy--] = array[j--];
        }
        for (;i>=low;i--) copy[locCopy--] = array[i];
        for (;j>mid;j--) copy[locCopy--] = array[j];
        for (int s = low; s<=high; s++) array[s] = copy[s];
        return (leftCount+rightCount+count)%1000000007;

    }

    public static int InversePairs1(int[] array) {
        int low = 0, high = 1;
        int count = 0;
        for (;low < array.length-1;low++) {
            for (; high < array.length; high++) {
                System.out.println("array[low] = " + array[low]);
                System.out.println("array[high] = "+array[high]);
                if (array[low] > array[high]) count++;
            }
            System.out.println(count);
        }
        return count%1000000007;
    }

    public static void main(String[] args) {
        int[] array = {364,637,341,406,747,995,234,971,571,219,993,407,416,366,
                315,301,601,650,418,355,460,505,360,965,516,648,727,667,
                465,849,455,181,486,149,588,233,144,174,557,67,746,550,
                474,162,268,142,463,221,882,576,604,739,288,569,256,936,
                275,401,497,82,935,983,583,523,697,478,147,795,380,973,958,
                115,773,870,259,655,446,863,735,784,3,671,433,630,425,930,
                64,266,235,187,284,665,874,80,45,848,38,811,267,575};
        InversePairs1(array);
    }


}
