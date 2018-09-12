package com.tz.JD;

import java.util.*;

/**
 * create by tz on 2018-09-07
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int num1 = 0;
            int num2 = 0;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            int[] prices  = new int[num1];
            Map<String,Integer> productsMap = new HashMap<>();
            for (int i = 0; i< num1; i++) {
                prices[i] = sc.nextInt();
            }

            for (int i = 0; i < num2; i++) {
                String pname = sc.next();
                //System.out.println(i + " = " + pname);
                //System.out.println(productsMap.containsKey(pname));
                if (productsMap.containsKey(pname)) {
                    //System.out.println("ok");
                    int t = productsMap.get(pname)+1;
                    productsMap.put(pname,t);
                } else productsMap.put(pname,1);
            }
            ArrayList<Integer> proNumList = new ArrayList<>(productsMap.values());
            Integer[] pArray = new Integer[proNumList.size()];
            proNumList.toArray(pArray);
            Arrays.sort(pArray);
            Arrays.sort(prices);

//            for (int xx : pArray) {
//                System.out.print(xx + " ");
//            }
//            System.out.println();
//            for(int yy : prices) {
//                System.out.print(yy + " ");
//            }
//            System.out.println();
            int max = 0, min = 0, j = 0,k = prices.length-1;
            for(int i = pArray.length-1; i >= 0; i--) {
               // System.out.println("max += "+ pArray[i] + "*" + prices[k]);
                //System.out.println("min += "+ pArray[i]+ "*" +prices[j]);
                max += pArray[i]*prices[k];
                min += pArray[i]*prices[j];
                j++;
                k--;
            }
            System.out.println(min + " " + max +"\n");

        }
    }
}
