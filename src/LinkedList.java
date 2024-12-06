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
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        traverse(ll.head);
        System.out.println();
        recursivePrint(ll.head);
    }
}