package practise.datastructures.problems;

class ReverseLinkedList {

    static Node head;

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void printLinkedList(ReverseLinkedList linkedList) {
        Node h = linkedList.head;
        while (linkedList.head != null) {
            System.out.println(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }
        System.out.println();
        linkedList.head = h;
    }

    // Reverse Linked List using Iterative Approach
    public static void reverseLinkedList(ReverseLinkedList linkedList) {
        Node prev = null;
        Node next = null;
        Node curr = linkedList.head;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        linkedList.head = prev;
    }


    // Reverse Linked List using recursion
    public static Node reverseLinkedListRecursivedly(Node head) {
        Node first;

        if(head == null || head.next == null) {
            return head;
        }

        first = reverseLinkedListRecursivedly(head.next);
        head.next.next = head;
        head.next = null;

        return first;

    }

    public static void main(String[] args) {
            ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
            reverseLinkedList.head = new Node(1);
            reverseLinkedList.head.next = new Node(2);
            reverseLinkedList.head.next.next = new Node(3);

            printLinkedList(reverseLinkedList);
            reverseLinkedList(reverseLinkedList);
            printLinkedList(reverseLinkedList);

            reverseLinkedList.head = reverseLinkedListRecursivedly(reverseLinkedList.head);
            printLinkedList(reverseLinkedList);
    }
}
