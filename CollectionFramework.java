class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CollectionFramework {
    private Node head;

    // Get the middle of the linked list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    private Node merge(Node head1, Node head2) {
        Node merged = new Node(-1); // Dummy node
        Node temp = merged;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Append remaining nodes
        if (head1 != null) {
            temp.next = head1;
        }
        if (head2 != null) {
            temp.next = head2;
        }

        return merged.next; // Skip the dummy node
    }

    // Merge sort on linked list
    public Node mergeSortLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find mid
        Node mid = getMid(head);

        // Split the list into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Recursively sort the two halves
        Node leftSorted = mergeSortLL(head);
        Node rightSorted = mergeSortLL(rightHead);

        // Merge the sorted halves
        return merge(leftSorted, rightSorted);
    }

    // Add a node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CollectionFramework list = new CollectionFramework();

        // Add elements to the list
        list.addLast(1);
        list.addLast(2);
        list.addLast(0);
        list.addLast(5);
        list.addLast(8);
        list.addLast(9);

        System.out.println("Original List:");
        list.printList();

        // Perform merge sort
        list.head = list.mergeSortLL(list.head);

        System.out.println("Sorted List:");
        list.printList();
    }
}
