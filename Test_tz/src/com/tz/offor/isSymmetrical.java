package com.tz.offor;

/**
 * create by tz on 2018-07-20
 */
public class isSymmetrical {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }


    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) return true;
        return isMorror(pRoot.left, pRoot.right);
    }

    private boolean isMorror(TreeNode left, TreeNode right) {
        if (left == null) return right == null;
        if (right == null) return left == null;
        if (left.val !=right.val) return false;
        return isMorror(left.right, right.left) && isMorror(left.left, right.right);
    }


}
