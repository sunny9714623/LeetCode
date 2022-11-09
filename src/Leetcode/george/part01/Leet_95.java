package Leetcode.george.part01;

import java.util.LinkedList;
import java.util.List;

public class Leet_95 {
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new LinkedList<>();
        return build(1,n);
    }

    private List<TreeNode> build(int lo, int hi) {
        List<TreeNode> res = new LinkedList<>();
        if(lo>hi){
            res.add(null);
            return res;
        }
        for(int i=lo;i<=hi;i++){
            List<TreeNode> leftTree = build(lo,i-1);
            List<TreeNode> rightTree = build(i+1,hi);
            // 给root节点穷举所有左右子树的集合
            for (TreeNode left : leftTree) {
                for (TreeNode right : rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
