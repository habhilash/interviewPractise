package practise.datastructures.problems;

import java.util.Stack;

public class ReverseLinkedListUsingStack {

    static class Node {
        int data;
        Node next;
    }

    static Node head = null;

    static void push(int new_data) {
        Node new_node = new Node();

        new_node.data = new_data;
        new_node.next = head;
        head = new_node;
    }

    static Node reverseLinkedList(Node head) {
        Stack<Node> stk = new Stack<>();

        Node ptr = head;
        while(ptr.next != null) {
            stk.push(ptr);
            ptr = ptr.next;
        }

        head = ptr;
        while(!stk.isEmpty()) {
            ptr.next = stk.peek();
            ptr = ptr.next;
            stk.pop();
        }
        ptr.next = null;

        return head;
    }

    static void printList(Node head) {
        while(head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        push(5);
        push(4);
        push(3);
        push(2);
        push(1);

        head = reverseLinkedList(head);

        printList(head);
    }
}
