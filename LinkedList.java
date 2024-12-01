public class LinkedList {
    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class members
    public Node head;
    public Node tail;
    public static int size;

    // Add first
    public void addFirst(int data) {
        // Step 1 - create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - newNode.next = head
        newNode.next = head;

        // Step 3 - head = newNode
        head = newNode;
    }

    // Add last
    public void addLast(int data) {
        // step1 - create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2 - tail.next = head
        tail.next = newNode;

        // Step 3 - tail = newNode
        tail = newNode;
    }

    // Add middle
    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx - 1; temp -> previous
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print the LinkedList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        ll.printList();
        System.out.println(ll.size);
    }
}
