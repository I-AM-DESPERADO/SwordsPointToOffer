package com.tz.offor;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * create by tz on 2018-07-20
 */
public class Print2 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    /**
     * 非递归完成
     * */

    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (pRoot == null) return result;
        queue.offer(pRoot);
        int now = 1, next = 0; //当前层的节点数量；下一层的节点数量
        while (!queue.isEmpty()) {
            TreeNode t = queue.poll();
            now--;
            list.add(t.val);
            if (t.left != null) {
                queue.offer(t.left);
                next++;
            }
            if (t.right != null) {
                queue.offer(t.right);
                next++;
            }
            if (now == 0) {
                ArrayList<Integer> clone = (ArrayList<Integer>) list.clone();
                result.add(clone);
                list.clear();
                now = next;
                next = 0;
            }
        }
        return result;
    }

    /**
     * 递归解决
     * */
    ArrayList<ArrayList<Integer>> Print2(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        depth(pRoot, 1, list);
        return list;
    }

    private void depth(TreeNode root, int i, ArrayList<ArrayList<Integer>> list) {
        if (root == null) return;
        if (i > list.size()) list.add(new ArrayList<Integer>());
        list.get(i - 1).add(root.val);

        depth(root.left, i + 1, list);
        depth(root.right, i + 1, list);

    }

}
