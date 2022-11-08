package Leetcode.george.part01;

public class Leet_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key){
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            TreeNode minNode = getMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right,minNode.val);
        }
        else if(root.val<key){
            root.right = deleteNode(root.right,key);
        }
        else if(root.val>key)
            root.left = deleteNode(root.left,key);
        return root;
    }

    private TreeNode getMin(TreeNode right) {
        while(right.left != null){
            right = right.left;
        }
        return right;
    }
}
