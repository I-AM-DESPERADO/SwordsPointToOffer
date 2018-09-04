package com.tz.Beike;

import java.util.*;

/**
 * create by tz on 2018-09-03
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pnum = sc.nextInt();

        HashMap<String, Integer>[] mlist = new HashMap[pnum];
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < pnum; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            HashMap<String,Integer> map = new HashMap<>();
            if (a == -1) {
                list.add(a);
                map.put("p",a);
                map.put("c",b);
            }else if (b == -1) {
                list.add(b);
                map.put("p",b);
                map.put("c",a);
            } else {
                int one = list.indexOf(a);
                int two = list.indexOf(b);
                if (one > two) {
                    map.put("p", b);
                    map.put("c", a);
                }
            }
            mlist[i] = map;
        }

        int[][] tem = new int[pnum+1][pnum+1];
        for (int i = 1; i< pnum; i++) {
            tem[mlist[i].get("p")][mlist[i].get("c")] = 1;
        }

        int qnum = sc.nextInt();
        int[][] que = new int[qnum][2];
        for (int i = 0; i < pnum; i++) {
            que[i][0] = sc.nextInt();
            que[i][1] = sc.nextInt();

            int rs1 = isPre(que[i][0], que[i][1], tem);
            int rs2 = isPre(que[i][1], que[i][0], tem);
            if (rs1==1) System.out.println(1);
            else if (rs2==1) System.out.println(2);
            else if (rs1 == 0 && rs2==0) System.out.println(0);
        }



    }

    private static int isPre(int a, int b, int[][] tem) {
        if(tem[a][b] == 1) return 1;
        else {
            for (int t : tem[a]){
                if (t == 1) {
                    isPre(t,b,tem);
                }
            }
        }
        return 0;
    }
}

