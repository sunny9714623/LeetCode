package Leetcode.george.part02;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet_797 {
    List<List<Integer>> res = new ArrayList<>();
    public static void main(String[] args) {

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        LinkedList<Integer> path = new LinkedList<>();
        traverse(graph,0,path);
        return res;
    }

    private void traverse(int[][] graph, int s, LinkedList<Integer> path) {
        //添加节点s到路径path
        path.add(s);
        int n = graph.length;
        if(s==n-1){
            //到达终点
            res.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }
        // 递归每一个相邻节点
        for (int v : graph[s]) {
            traverse(graph,v,path);
        }
        path.removeLast();
    }
}
