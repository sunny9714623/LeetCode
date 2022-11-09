package Leetcode.george.part01;

public class Leet_1650 {
    public Node lowestCommonAncestor(Node p, Node q){
        Node a = p,b= q;
        //链表双指针，求链表交点
        while(a!=b){
            //a走一步，如果走到根节点，转到q节点
            if(a==null) a=q;
            else a=a.parent;
            //b走一步，如果走到根节点，转到p节点
            if(b==null) b=p;
            else b = b.parent;
        }
        return a;
    }
}
class Node {
    int val;
    Node left;
    Node right;
    Node parent;
};
