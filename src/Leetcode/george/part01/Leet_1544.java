package Leetcode.george.part01;

public class Leet_1544 {
    boolean foundP = false, foundQ = false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = find(root,p.val,q.val);
        if(!foundP || !foundQ){
            return null;
        }
        // 当p和q都在二叉树中时，才有公共祖先
        return res;
    }

    private TreeNode find(TreeNode root, int val1, int val2) {
        if(root == null) return null;
        TreeNode left = find(root.left,val1,val2);
        TreeNode right = find(root.right,val1,val2);
        if(left!=null && right!=null){
            return root;
        }
        // 判断当前节点是不是目标值
        if(root.val == val1 || root.val == val2){
            //找到记录
            if(root.val == val1) foundP = true;
            if(root.val == val2) foundQ = true;
            return root;
        }
        return left != null? left :right;
    }
}
