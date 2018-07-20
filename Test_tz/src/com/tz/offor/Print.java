package com.tz.offor;

/**
 * create by tz on 2018-07-20
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目描述
 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。

 * */

public class Print {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) return result;
        ArrayList<Integer> list = null;
        Queue<TreeNode> queue = new LinkedList<>();
        int rows = 1;
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = queue.poll();
                if (rows % 2==0)
                    list.add(0,t.val);
                else
                    list.add(t.val);
                if (t.left != null)
                    queue.offer(t.left);
                if (t.right != null)
                    queue.offer(t.right);
            }
            result.add(list);
            rows++;
        }
        return result;


    }

}
