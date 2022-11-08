package Leetcode.george.part01;

public class Leet_701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        if(root.val<val){
            root.right = insertIntoBST(root.right,val);
        }
        if(root.val>val){
            root.left = insertIntoBST(root.left,val);
        }
        return root;
    }
}
