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
    }
}