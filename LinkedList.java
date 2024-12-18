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
    public static Node head;
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

    // remove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // previous : i = size - 2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    /*
     * Search (Iterative) - Search for a key in a linked list . Return the position
     * where it is found . If it is not found , return -1
     */
    public int itrSearch(int key) {
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        // key not found
        return -1;
    }

    /*
     * Search (Search) - for a key in a Linked List. Return the position where it is
     * found. If not found, return -1, Use Recursion \.
     */
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // Reverse a Linked List (Iterative Approach)
    public void reversedLinkedList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Find & Remove Nth node from End (Iterative Approach)
    public void removeNthNodeFromEnd(int n) {
        // calculae size
        int size = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head = head.next; // removeFirst
            return;
        }

        // size - n
        int i = 1;
        int iTofind = size - n;
        Node prev = head;
        while (i < iTofind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // Slow - Fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // + 1
            fast = fast.next.next; // + 2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome() {
        if (head == null || head != null) {
            return true;
        }

        // Step - 1 find mid
        Node miNode = findMid(head);

        // Step - 2 reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; // right half head
        Node left = head; // left half head

        // Step - 3 check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // Detect a Loop/Cycle in a Linked List - Floyd's Cycle Finding Algorithm)
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // + 1
            fast = fast.next.next; // + 2
            if (slow == fast) {
                return true; // Cycle Exists
            }
        }
        return false; // Cycle doesn't exist
    }

    // Remove a Loop/Cycle in a Linked List
    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next; // + 1
            fast = fast.next.next; // + 2
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.printList();
        // ll.removeLast();
        // ll.printList();

        // System.out.println("Size of linked list : " + ll.size); // prins the size of
        // the linked list

        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));

        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));

        // ll.reversedLinkedList();

        // ll.removeNthNodeFromEnd(3);

        // System.out.println(ll.checkPalindrome());

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(1);
        head.next.next.next = temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }
}
