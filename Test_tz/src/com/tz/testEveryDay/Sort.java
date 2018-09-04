package com.tz.testEveryDay;

/**
 * create by tz on 2018-08-28
 */
public class Sort {
   /**
    * 快排
    * */
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            int middle = getMiddle(nums,low,high);
            quickSort(nums, low, middle - 1);
            quickSort(nums, middle + 1, high);
        }
    }
    private static int getMiddle(int[] nums, int low, int high) {
        int temp = nums[low];
        while (low < high) {
            while (low < high && nums[high] > temp) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] <= temp) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] num) {
        int temp = 0;
        int size = num.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }


    /**
     * 归并排序
     * */
    public static void mergeSort(int nums[], int low, int high) {
        int mid = (low + high)/2;
        //System.out.println(mid);
        if (low < high) {
            mergeSort(nums, low, mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        //System.out.println(temp.length);
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <=high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            }else {
                temp[k++] = nums[j++];

            }
        }
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }
        while (j <= high) {
            temp[k] = nums[j];
            k++;
            j++;
        }
        // 把新数组中的数覆盖nums数组
        System.arraycopy(temp, 0, nums, low, temp.length);

    }



    public static void main(String[] args) {
        int[] param = new int[]{1, 1, 2, 65, 34, 76, 23, 8, 6, 4, 56};
        int low = 0;
        int high = param.length-1;
        //quickSort(param, low, high);
        //bubbleSort(param);
        mergeSort(param, low, high);
        for (int a : param) {
            System.out.print(a + " ");
        }
    }
}
