public class DoubleLL {
    // Doubly Linked List
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Remove a node at the last
    public void removeLast() {
        if (head == null) { // Case 1: The list is empty
            return;
        }
        if (head == tail) { // Case 2: Only one element in the list
            head = tail = null;
            size--;
            return;
        }
        // Case 3: More than one element in the list
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    // Print the list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse a doubly Linked List
    public void Reverse() {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();

        // Add elements to the doubly linked list
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        // Print the list
        // dll.print();

        // dll.removeLast();
        dll.print();
        dll.Reverse();
        dll.print();

        // Print the size of the list
        System.out.println("Size of the list: " + dll.size);
    }
}