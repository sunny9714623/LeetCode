package Leetcode.george.part01;

import java.util.HashSet;

public class Leet_1676 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
        //将列表转换为hash集合，便于判断是否存在
        HashSet<Integer> values = new HashSet<>();
        for (TreeNode node : nodes) {
            values.add(node.val);
        }
        return find(root,values);
    }
    // 寻找values的最近公共祖先
    private TreeNode find(TreeNode root, HashSet<Integer> values) {
        if(root == null) return null;
        if(values.contains(root.val)){
            return root;
        }
        TreeNode left = find(root.left,values);
        TreeNode right = find(root.right,values);
        if(left!=null && right !=null){
            return root;
        }
        return left != null ? left: right;
    }
}
