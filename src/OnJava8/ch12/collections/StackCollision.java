package OnJava8.ch12.collections;

import java.util.*;

public class StackCollision {
    public static void main(String[] args) {
        OnJava8.ch12.collections.Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
        System.out.println();
        java.util.Stack<String> stack2 = new java.util.Stack<>();
        for (String s : "My dog has fleas".split(" "))
            stack2.push(s);
        while (!stack2.empty())
            System.out.println(stack2.pop() + " ");
    }
}
