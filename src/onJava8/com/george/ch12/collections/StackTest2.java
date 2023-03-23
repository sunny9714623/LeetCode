package onJava8.com.george.ch12.collections;

public class StackTest2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" "))
            stack.push(s);
        while (!stack.isEmpty())
            System.out.println(stack.pop() + " ");
        System.out.println();
        java.util.Stack<String> stack2 = new java.util.Stack<>();
        for (String s : "My dog has fleas".split(" "))
            stack2.push(s);
        while (!stack2.empty()) {
            System.out.println(stack2.pop() + " ");
        }
    }
}
