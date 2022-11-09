/*
package Leetcode.george.part01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Leet_341 implements Iterator<Integer> {

    private LinkedList<NestedInteger> list;
    public Leet_341(List<NestedInteger> nestedList){
        list = new LinkedList<>(nestedList);
    }
    @Override
    public boolean hasNext() {
        while(!list.isEmpty() && !list.get(0).isInteger()){
            List<NestedInteger> first = list.remove(0).getList();
            for(int i=first.size()-1;i>=0;i--){
                list.addFirst(first.get(i));
            }
        }
        return !list.isEmpty();
    }

    @Override
    public Integer next() {
        return list.remove(0).getInteger();
    }
}
 */
