package com.tz.keep;

import java.util.Scanner;
import java.util.Stack;

/**
 * create by tz on 2018-08-25
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int [][] city = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                city[i][j] = scanner.nextInt();
            }
        }
        System.out.println(MaximalRectangle(city));
    }

    private static int MaximalRectangle(int[][] rec) {
        int[] h = new int[rec[0].length];
        int m = rec.length;
        int n = rec[0].length;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    h[j] = rec[i][j];
                } else {
                    //h[j] = rec[i][j]==0 ? 0:rec[i-1][j]+1;
                    h[j] = rec[i][j]==0 ? 0:h[j]+1;

                }
            }
            for (int x = 0 ;x < n; x ++){
                System.out.print("h["+ x+ "] = " + h[x] + "  ");
            }
            System.out.print("\n");
            max = Math.max(max, LargeRectangleArea(h));
        }

        return max;
    }

    private static int LargeRectangleArea(int[] h) {
        if (h == null || h.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int i = 1, max = h[0];
        stack.push(0);

        while (i < h.length || (i==h.length && !stack.empty())) {
            if(i != h.length && (stack.empty() || h[i] >= h[stack.peek()])) {
                System.out.println("Push[i] = " + i);
                stack.push(i);
                i++;
            }else {
                System.out.println("pop = " + stack.peek());
                int top = h[stack.pop()];
                System.out.println("top = " + top);
                int currMax = !stack.isEmpty()? top*(i - stack.peek() - 1) :top * i;
                System.out.println("currentMax = " + currMax);
                max = Math.max(currMax, max);
            }
        }
        System.out.println("************************************");
        return max;

    }


}
