package Leetcode.george.part01;

public class Leet_98 {

    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root,null,null);
    }
    public static boolean isValidBST(TreeNode root,TreeNode min,TreeNode max){
        if(root == null) return true;
        if(min!=null && root.val<=min.val) return false;
        if(max!=null && root.val >= max.val) return false;
        //限定左子树的最大值是root.val,右子树的最小值是root.val;
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
