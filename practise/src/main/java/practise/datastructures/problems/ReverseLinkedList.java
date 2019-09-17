package practise.datastructures.problems;

class MyLinkedList {

    static Node head;

    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void printLinkedList(MyLinkedList linkedList) {
        Node h = linkedList.head;
        while (linkedList.head != null) {
            System.out.println(linkedList.head.data + " ");
            linkedList.head = linkedList.head.next;
        }
        System.out.println();
        linkedList.head = h;
    }

    public static void reverseLinkedList(MyLinkedList linkedList) {
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

    public static void main(String[] args) {
            MyLinkedList myLinkedList = new MyLinkedList();
            myLinkedList.head = new Node(1);
            myLinkedList.head.next = new Node(2);
            myLinkedList.head.next.next = new Node(3);

            printLinkedList(myLinkedList);
            reverseLinkedList(myLinkedList);
            printLinkedList(myLinkedList);
    }
}
