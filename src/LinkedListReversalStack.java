import java.util.Stack;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListReversalStack {
    public static void linkedListReversalStack(Node head) {
        Stack<Node> stack = new Stack<Node>();
        Node temp = head;
        while(temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        
        while(!stack.isEmpty()) {
            Node popped = stack.pop();
            System.out.print(popped.data + " ");
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        linkedListReversalStack(head);
    }
}
