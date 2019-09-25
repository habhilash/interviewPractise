package practise.datastructures.problems;

import java.util.HashMap;
import java.util.Map;

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

    // Print middle of the linked list using slow pointer and fast pointer
    public static void printMiddleElementOfLinkedList(Node head) {
        Node slow_ptr = head;
        Node fast_ptr = head;

        if (head != null) {
            while(fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("Middle element of Linked List is : " + slow_ptr.data + "\n");
        }
    }

    public static void printMiddleUsingOddCount(Node head) {
        int count = 0;
        Node mid = head;

        while (head != null) {
            if (count % 2 == 1)
                mid = mid.next;

            ++count;
            head = head.next;
        }

        if (mid != null) {
            System.out.println("Middle elment is : " + mid.data);
        }
    }

    public static void main(String[] args) {
            ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
            reverseLinkedList.head = new Node(1);
            reverseLinkedList.head.next = new Node(2);
            reverseLinkedList.head.next.next = new Node(3);
            reverseLinkedList.head.next.next.next = new Node(4);

            printLinkedList(reverseLinkedList);
            reverseLinkedList(reverseLinkedList);
            printLinkedList(reverseLinkedList);

            reverseLinkedList.head = reverseLinkedListRecursivedly(reverseLinkedList.head);
            printLinkedList(reverseLinkedList);

            printMiddleElementOfLinkedList(reverseLinkedList.head);
            printMiddleUsingOddCount(reverseLinkedList.head);

        HashMap<Integer, String > hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(null, "b");
        hm.put(2, "c");

        for(Map.Entry m : hm.entrySet()) {
            m.getKey();
            m.getValue();
        }

    }
}
