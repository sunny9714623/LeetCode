package Leetcode.george.part01;

public class Leet_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root,p.val,q.val);
    }

    private TreeNode find(TreeNode root, int val1, int val2) {
        if(root == null) return null;
        if(root.val == val1 || root.val == val2){
            // root等于目标值，直接返回
            return root;
        }
        TreeNode left = find(root.left,val1,val2);
        TreeNode right = find(root.right,val1,val2);
        //已经知道左右子树是否存在目标
        if(left != null && right != null){
            return root;
        }
        return left != null ? left : right;
    }
}
