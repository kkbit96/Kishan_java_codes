import java.util.EmptyStackException;
import java.util.Stack;

public class JavaStack {
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop :");
        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }

    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Top element is :" + element);
    }

    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);
        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position :" + pos);
    }

    public static void main(String[] args) {
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println("Pop :");
    while (!stack.isEmpty()) {
        System.out.println(stack.pop());
    }

    try {
        System.out.println("Top element is :" + stack.peek());
    } catch (EmptyStackException e) {
        System.out.println("Stack is empty, cannot perform peek operation.");
    }

    int elementToSearch = 2;
    int position = stack.search(elementToSearch);
    if (position == -1) {
        System.out.println("Element not found");
    } else {
        System.out.println("Element is found at position :" + position);
    }
}
}

