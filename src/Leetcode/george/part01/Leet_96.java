package Leetcode.george.part01;

public class Leet_96 {
    int[][] memo;
    public int numTrees(int n) {
        memo = new int[n+1][n+1];
        return count(1,n);
    }
    private int count(int lo, int hi) {
        //显然当lo > hi闭区间[lo, hi]肯定是个空区间，也就对应着空节点 null，虽然是空节点，但是也是一种情况，所以要返回 1 而不能返回 0
        if(lo>hi)return 1;
        if(memo[lo][hi]!=0)
            return memo[lo][hi];
        int res =0;
        for(int i=lo;i<=hi;i++){
            int left = count(lo,i-1);
            int right = count(i+1,hi);
            //左右子树的组合数乘积是bst的总数
            res+=left*right;
        }
        memo[lo][hi] = res;
        return res;
    }
}
