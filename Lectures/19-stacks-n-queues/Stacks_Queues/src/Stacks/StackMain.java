package Stacks;

public class StackMain {
    public static void main ( String[] args ) throws StackException {
        Custom_stack stack = new Custom_stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println (stack.pop());
        System.out.println (stack.pop());
        System.out.println (stack.pop());
        System.out.println (stack.pop());
        System.out.println (stack.pop());
    }
}
