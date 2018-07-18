package com.tz.offor;


import sun.reflect.generics.tree.Tree;

/**
 * create by tz on 2018-07-18
 */

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * */
public class IsBalanced_Solution {


    public boolean IsBalanced_Solution(TreeDepth.TreeNode root) {
        if (root == null) return true;
        int leftDepth = getTreeDepth(root.left) + 1;
        int rightDepth = getTreeDepth(root.right) + 1;
        if(leftDepth-rightDepth > 1 || leftDepth-rightDepth < -1) return false;
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public static int getTreeDepth(TreeDepth.TreeNode root) {
        if (root == null) return 0;
        return getTreeDepth(root.left) > getTreeDepth(root.right) ? getTreeDepth(root.left)+1 : getTreeDepth(root.right)+1;
    }
}
