package com.tz.offor;

/**
 * create by tz on 2018-07-20
 */
public class SerializeAndDeserialize {



    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    int index = 0;

    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val+",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }


    TreeNode Deserialize(String str) {
        if (str == null) {
            return null;
        }
        index = -1;
        String[] strings = str.split(",");
        return DeserializeStr(strings);
    }

    private TreeNode DeserializeStr(String[] strings) {
        index++;
        TreeNode treeNode = null;
        if (!strings[index].equals("#")) {
            treeNode = new TreeNode(Integer.valueOf(strings[index]));
            treeNode.left = DeserializeStr(strings);
            treeNode.right = DeserializeStr(strings);
        }
        return treeNode;
    }

}
