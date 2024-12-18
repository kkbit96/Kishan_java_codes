public class LinkedList {
    Node head;

    public LinkedList() {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
    }
    public static void traverse(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void recursivePrint(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data + " ");
        recursivePrint(head.next);
    }
    public static int Search(Node head, int key){
        Node curr = head;
        int index = 1;
        while(curr!=null){
            if(curr.data==key){
                return index;
            }
            index++;
            curr = curr.next;
        }
        return -1;
    }
    public static int recursiveSearch(Node head, int key, int index) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return index;
        }
        return recursiveSearch(head.next, key, index + 1);
    }

    public static Node insertAtBeginning(Node head, int data){
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    //Insert at the end of the singly linked list
    public static Node insertAtEnd(Node head, int data){
        Node temp = new Node(data);
        if(head==null){
            return temp;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
    //Delete first node of a singly linked list
    public static Node deleteFirstNode(Node head){
        if(head==null){
            return null;
        }
        return head.next;
    }
    //Delete from a given position
    public static Node deleteFromPos(Node head, int pos) {
        if(head == null) {
            return null;
        }
        if(pos == 1) {
            return head.next;
        }
        Node curr = head;
        for(int i=1; i<=pos-2 && curr!=null; i++) {
            curr = curr.next;
        }
        if(curr == null || curr.next == null) {
            return head;
        }
        curr.next = curr.next.next;
        return head;
    }
    //Delete last node of a singly linked list
    public static Node deleteLastNode(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node curr = head;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
    //Insert at a specific position in a singly linked list
    public static Node insertAtIndex(Node head, int index, int data){
        Node temp = new Node(data);
        if(head == null){
            if(index == 1) return temp;
            else return head;
        }
        if(index == 1){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        for (int i = 1; i < index - 1; i++) {
            curr = curr.next;
            if (curr == null) {
                System.out.println("Position out of range");
                return head;
            }
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    //Sorted insert in a singly linked list
    public static Node SortedInsert(Node head, int data){
        Node temp = new Node(data);
        if(head==null){
            return temp;
        }
        if(data<head.data){
            temp.next = head;
            return temp;
        }
        Node curr = head;
        while(curr.next!=null && curr.next.data<data){
            curr = curr.next;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    //Middle of a singly linked list
    public static int middle(Node head){
        if(head==null){
            return -1;
        }
        Node slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    //Return nth node from the end of a linked list
    public static int nFromEnd(Node head, int n){
        int len = 0;
        for(Node curr = head; curr!=null; curr = curr.next){
            len++;
        }
        if(len<n) return -1;
        Node curr = head;
        for(int i=0;i<len-n+1;i++){
            curr = curr.next;
        }
        return curr.data;
    }
    //Reverse a singly linked list - - Revise this algorithm
    public static Node reverse(Node head){
        Node prev = null, curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        traverse(ll.head);
        System.out.println();
        recursivePrint(ll.head);
        System.out.println();
        insertAtEnd(ll.head, 50);
        recursivePrint(ll.head);
        insertAtIndex(ll.head, 3, 25);
        System.out.println();
        recursivePrint(ll.head);
        System.out.println();
        SortedInsert(ll.head, 35);
        recursivePrint(ll.head);
        System.out.println();
        System.out.println(middle(ll.head));
        System.out.println(nFromEnd(ll.head, 2));
    }
}